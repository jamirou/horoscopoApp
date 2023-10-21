# HoroscopeApp

Esta aplicación se basa en el [curso de YouTube de ArisDev](https://www.youtube.com/watch?v=UaR7GSNACsM). Puedes encontrar el repositorio original en GitHub [aquí](https://github.com/ArisGuimera/Android-Expert-Intermedio).

---

## Contenido
1. [Arquitectura](#arquitectura)
2. [Organización del Proyecto](#organización-del-proyecto)
3. [Funcionalidades](#funcionalidades)

## Arquitectura
La aplicación sigue una arquitectura MVVM (Model-View-ViewModel) y se adhiere a los principios de "clean code". Utiliza Android Jetpack, Kotlin, y el componente de navegación (Navigation Component) para la gestión de la navegación. Además, se hace uso de StateFlow y corutinas para la programación asincrónica.

## Organización del Proyecto
La estructura del proyecto se organiza de la siguiente manera:

- **data**
  - **core**
    - **interceptors**
      - AuthInterceptors.kt
  - **network**
    - **response**
      - PredictionResponse.kt
    - HoroscopeApiService.kt
    - NetworkModule.kt
  - providers
    - HoroscopeProviders.kt
  - RepositoryImpl.kt
- **domain**
  - **model**
    - HoroscopeInfo.kt
    - HoroscopeModel.kt
    - PredictionModel.kt
  - usecase
    - GetPredictionUseCase.kt
  - Repository.kt
- **ui**
  - **core**
    - **listeners**
      - OnSwipeTouchListeners.kt
  - **detail**
    - HoroscopeDetailActivity.kt
    - HoroscopeDetailState.kt
    - HoroscopeDetailViewModel.kt
  - **home**
    - MainActivity.kt
  - **horoscope**
    - **adapter**
      - HoroscopeAdapter.kt
      - HoroscopeaViewHolder.kt
    - HoroscopeFragment.kt
    - HoroscopeViewModel.kt
  - **luck**
    - LuckFragment.kt
    - LuckViewModel.kt
  - model
    - LuckyViewModel.kt
  - **palmistry**
    - PalmistryFragment.kt
  - **providers**
    - RandomCardProviders.kt
- Horoscopoapp.kt

## Funcionalidades
La aplicación incluye las siguientes funcionalidades:
- Fragments
- Navigation Component
- Gradle KTS
- Inyección de Dependencias
- StateFlow y corutinas
- RecyclerView
- Retrofit, interceptors y mappers
- Intents
- Camera X
- Animaciones
- Unit Tests y UI Tests

### Detalles de los Fragments
1. **PalmistryFragment**
   - El `PalmistryFragment` permite a los usuarios acceder a la función de lectura de palmas utilizando la cámara del dispositivo. Verifica y solicita permiso de cámara y proporciona una vista previa de la cámara en la interfaz de usuario. En caso de problemas, maneja excepciones y muestra mensajes de error

2. **HoroscopeDetailActivity**
   - `HoroscopeDetailActivity` muestra detalles y predicciones específicas para cada signo del zodíaco. Utiliza `HoroscopeDetailViewModel` para obtener y mostrar datos, y proporciona una interfaz de usuario con una imagen representativa del signo, el título y la descripción de la predicción. Se manejan estados de carga, error y éxito para brindar una experiencia fluida al usuario.

3. **HoroscopeFragment**
   - `HoroscopeFragment` muestra una lista de signos del zodíaco y permite a los usuarios acceder a detalles específicos de cada signo al seleccionar uno. Utiliza ViewModels y LiveData para una experiencia de usuario eficiente.

4. **LuckFragment**
   - `LuckFragment` es un fragmento interactivo que permite a los usuarios girar una ruleta para obtener predicciones aleatorias. La interfaz muestra la predicción y permite compartirla, todo ello con animaciones atractivas. Utiliza `RandomCardProvider` para obtener las predicciones aleatorias.

