package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AdaptiveLibraryAccessors laccForAdaptiveLibraryAccessors = new AdaptiveLibraryAccessors(owner);
    private final AndroidXLibraryAccessors laccForAndroidXLibraryAccessors = new AndroidXLibraryAccessors(owner);
    private final CoilLibraryAccessors laccForCoilLibraryAccessors = new CoilLibraryAccessors(owner);
    private final CoroutinesLibraryAccessors laccForCoroutinesLibraryAccessors = new CoroutinesLibraryAccessors(owner);
    private final DatastoreLibraryAccessors laccForDatastoreLibraryAccessors = new DatastoreLibraryAccessors(owner);
    private final FirebaseLibraryAccessors laccForFirebaseLibraryAccessors = new FirebaseLibraryAccessors(owner);
    private final KmpPaletteLibraryAccessors laccForKmpPaletteLibraryAccessors = new KmpPaletteLibraryAccessors(owner);
    private final KoinLibraryAccessors laccForKoinLibraryAccessors = new KoinLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final KotlinXLibraryAccessors laccForKotlinXLibraryAccessors = new KotlinXLibraryAccessors(owner);
    private final KtorLibraryAccessors laccForKtorLibraryAccessors = new KtorLibraryAccessors(owner);
    private final PagingLibraryAccessors laccForPagingLibraryAccessors = new PagingLibraryAccessors(owner);
    private final RoomLibraryAccessors laccForRoomLibraryAccessors = new RoomLibraryAccessors(owner);
    private final SqliteLibraryAccessors laccForSqliteLibraryAccessors = new SqliteLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for leakCanary (com.squareup.leakcanary:leakcanary-android)
     * with versionRef 'leakCanary'.
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLeakCanary() {
            return create("leakCanary");
    }

        /**
         * Creates a dependency provider for mockk (io.mockk:mockk)
     * with versionRef 'mockk'.
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockk() {
            return create("mockk");
    }

        /**
         * Creates a dependency provider for napier (io.github.aakira:napier)
     * with versionRef 'napier'.
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getNapier() {
            return create("napier");
    }

        /**
         * Creates a dependency provider for navigation (org.jetbrains.androidx.navigation:navigation-compose)
     * with versionRef 'navigation'.
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getNavigation() {
            return create("navigation");
    }

        /**
         * Creates a dependency provider for sdpSsp (network.chaintech:sdp-ssp-compose-multiplatform)
     * with versionRef 'sdpSsp'.
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSdpSsp() {
            return create("sdpSsp");
    }

        /**
         * Creates a dependency provider for turbine (app.cash.turbine:turbine)
     * with versionRef 'turbine'.
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTurbine() {
            return create("turbine");
    }

    /**
     * Returns the group of libraries at adaptive
     */
    public AdaptiveLibraryAccessors getAdaptive() {
        return laccForAdaptiveLibraryAccessors;
    }

    /**
     * Returns the group of libraries at androidX
     */
    public AndroidXLibraryAccessors getAndroidX() {
        return laccForAndroidXLibraryAccessors;
    }

    /**
     * Returns the group of libraries at coil
     */
    public CoilLibraryAccessors getCoil() {
        return laccForCoilLibraryAccessors;
    }

    /**
     * Returns the group of libraries at coroutines
     */
    public CoroutinesLibraryAccessors getCoroutines() {
        return laccForCoroutinesLibraryAccessors;
    }

    /**
     * Returns the group of libraries at datastore
     */
    public DatastoreLibraryAccessors getDatastore() {
        return laccForDatastoreLibraryAccessors;
    }

    /**
     * Returns the group of libraries at firebase
     */
    public FirebaseLibraryAccessors getFirebase() {
        return laccForFirebaseLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kmpPalette
     */
    public KmpPaletteLibraryAccessors getKmpPalette() {
        return laccForKmpPaletteLibraryAccessors;
    }

    /**
     * Returns the group of libraries at koin
     */
    public KoinLibraryAccessors getKoin() {
        return laccForKoinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlinX
     */
    public KotlinXLibraryAccessors getKotlinX() {
        return laccForKotlinXLibraryAccessors;
    }

    /**
     * Returns the group of libraries at ktor
     */
    public KtorLibraryAccessors getKtor() {
        return laccForKtorLibraryAccessors;
    }

    /**
     * Returns the group of libraries at paging
     */
    public PagingLibraryAccessors getPaging() {
        return laccForPagingLibraryAccessors;
    }

    /**
     * Returns the group of libraries at room
     */
    public RoomLibraryAccessors getRoom() {
        return laccForRoomLibraryAccessors;
    }

    /**
     * Returns the group of libraries at sqlite
     */
    public SqliteLibraryAccessors getSqlite() {
        return laccForSqliteLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AdaptiveLibraryAccessors extends SubDependencyFactory {

        public AdaptiveLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.jetbrains.compose.material3.adaptive:adaptive)
         * with versionRef 'material3Adaptive'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("adaptive.core");
        }

    }

    public static class AndroidXLibraryAccessors extends SubDependencyFactory {

        public AndroidXLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activity (androidx.activity:activity-compose)
         * with versionRef 'androidxActivity'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getActivity() {
                return create("androidX.activity");
        }

    }

    public static class CoilLibraryAccessors extends SubDependencyFactory {
        private final CoilComposeLibraryAccessors laccForCoilComposeLibraryAccessors = new CoilComposeLibraryAccessors(owner);

        public CoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktor (io.coil-kt.coil3:coil-network-ktor)
         * with versionRef 'coil'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtor() {
                return create("coil.ktor");
        }

            /**
             * Creates a dependency provider for multiplatform (io.coil-kt.coil3:coil)
         * with versionRef 'coil'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMultiplatform() {
                return create("coil.multiplatform");
        }

        /**
         * Returns the group of libraries at coil.compose
         */
        public CoilComposeLibraryAccessors getCompose() {
            return laccForCoilComposeLibraryAccessors;
        }

    }

    public static class CoilComposeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public CoilComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (io.coil-kt.coil3:coil-compose)
         * with versionRef 'coil'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("coil.compose");
        }

            /**
             * Creates a dependency provider for core (io.coil-kt.coil3:coil-compose-core)
         * with versionRef 'coil'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("coil.compose.core");
        }

    }

    public static class CoroutinesLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public CoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for coroutines (org.jetbrains.kotlinx:kotlinx-coroutines-core)
         * with versionRef 'kotlinxCoroutines'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("coroutines");
        }

            /**
             * Creates a dependency provider for swing (org.jetbrains.kotlinx:kotlinx-coroutines-swing)
         * with versionRef 'kotlinxCoroutines'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSwing() {
                return create("coroutines.swing");
        }

    }

    public static class DatastoreLibraryAccessors extends SubDependencyFactory {

        public DatastoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for preferences (androidx.datastore:datastore-preferences-core)
         * with versionRef 'datastore'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreferences() {
                return create("datastore.preferences");
        }

    }

    public static class FirebaseLibraryAccessors extends SubDependencyFactory {

        public FirebaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for BOM (com.google.firebase:firebase-bom)
         * with versionRef 'firebaseBOM'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBOM() {
                return create("firebase.BOM");
        }

            /**
             * Creates a dependency provider for analytics (com.google.firebase:firebase-analytics-ktx)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnalytics() {
                return create("firebase.analytics");
        }

            /**
             * Creates a dependency provider for crashlytics (com.google.firebase:firebase-crashlytics-ktx)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCrashlytics() {
                return create("firebase.crashlytics");
        }

            /**
             * Creates a dependency provider for performance (com.google.firebase:firebase-perf)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPerformance() {
                return create("firebase.performance");
        }

    }

    public static class KmpPaletteLibraryAccessors extends SubDependencyFactory {

        public KmpPaletteLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (com.kmpalette:kmpalette-core)
         * with versionRef 'kmpPalette'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("kmpPalette.core");
        }

            /**
             * Creates a dependency provider for network (com.kmpalette:extensions-network)
         * with versionRef 'kmpPalette'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNetwork() {
                return create("kmpPalette.network");
        }

    }

    public static class KoinLibraryAccessors extends SubDependencyFactory {
        private final KoinAndroidxLibraryAccessors laccForKoinAndroidxLibraryAccessors = new KoinAndroidxLibraryAccessors(owner);

        public KoinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (io.insert-koin:koin-android)
         * with versionRef 'koinAndroid'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("koin.android");
        }

            /**
             * Creates a dependency provider for compose (io.insert-koin:koin-compose)
         * with versionRef 'koinCompose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("koin.compose");
        }

            /**
             * Creates a dependency provider for composeViewModel (io.insert-koin:koin-compose-viewmodel)
         * with versionRef 'koinComposeViewModel'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getComposeViewModel() {
                return create("koin.composeViewModel");
        }

            /**
             * Creates a dependency provider for core (io.insert-koin:koin-core)
         * with versionRef 'koinCore'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("koin.core");
        }

        /**
         * Returns the group of libraries at koin.androidx
         */
        public KoinAndroidxLibraryAccessors getAndroidx() {
            return laccForKoinAndroidxLibraryAccessors;
        }

    }

    public static class KoinAndroidxLibraryAccessors extends SubDependencyFactory {

        public KoinAndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (io.insert-koin:koin-androidx-compose)
         * with versionRef 'koinAndroidxCompose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("koin.androidx.compose");
        }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlin:kotlin-test)
         * with versionRef 'kotlin'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() {
                return create("kotlin.test");
        }

    }

    public static class KotlinXLibraryAccessors extends SubDependencyFactory {
        private final KotlinXCoroutinesLibraryAccessors laccForKotlinXCoroutinesLibraryAccessors = new KotlinXCoroutinesLibraryAccessors(owner);

        public KotlinXLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for dateTime (org.jetbrains.kotlinx:kotlinx-datetime)
         * with versionRef 'kotlinxDateTime'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDateTime() {
                return create("kotlinX.dateTime");
        }

            /**
             * Creates a dependency provider for serializationJson (org.jetbrains.kotlinx:kotlinx-serialization-json)
         * with versionRef 'kotlinxSerializationJson'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSerializationJson() {
                return create("kotlinX.serializationJson");
        }

        /**
         * Returns the group of libraries at kotlinX.coroutines
         */
        public KotlinXCoroutinesLibraryAccessors getCoroutines() {
            return laccForKotlinXCoroutinesLibraryAccessors;
        }

    }

    public static class KotlinXCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinXCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlinx:kotlinx-coroutines-test)
         * with versionRef 'kotlinxCoroutines'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() {
                return create("kotlinX.coroutines.test");
        }

    }

    public static class KtorLibraryAccessors extends SubDependencyFactory {

        public KtorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (io.ktor:ktor-client-android)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("ktor.android");
        }

            /**
             * Creates a dependency provider for contentNegotiation (io.ktor:ktor-client-content-negotiation)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getContentNegotiation() {
                return create("ktor.contentNegotiation");
        }

            /**
             * Creates a dependency provider for core (io.ktor:ktor-client-core)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("ktor.core");
        }

            /**
             * Creates a dependency provider for darwin (io.ktor:ktor-client-darwin)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDarwin() {
                return create("ktor.darwin");
        }

            /**
             * Creates a dependency provider for java (io.ktor:ktor-client-java)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJava() {
                return create("ktor.java");
        }

            /**
             * Creates a dependency provider for json (io.ktor:ktor-serialization-kotlinx-json)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() {
                return create("ktor.json");
        }

            /**
             * Creates a dependency provider for logging (io.ktor:ktor-client-logging)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLogging() {
                return create("ktor.logging");
        }

            /**
             * Creates a dependency provider for mock (io.ktor:ktor-client-mock)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMock() {
                return create("ktor.mock");
        }

    }

    public static class PagingLibraryAccessors extends SubDependencyFactory {

        public PagingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (app.cash.paging:paging-common)
         * with versionRef 'paging'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() {
                return create("paging.common");
        }

            /**
             * Creates a dependency provider for compose (app.cash.paging:paging-compose-common)
         * with versionRef 'paging'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("paging.compose");
        }

    }

    public static class RoomLibraryAccessors extends SubDependencyFactory {

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
         * with versionRef 'room'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("room.compiler");
        }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
         * with versionRef 'room'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("room.runtime");
        }

    }

    public static class SqliteLibraryAccessors extends SubDependencyFactory {

        public SqliteLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bundled (androidx.sqlite:sqlite-bundled)
         * with versionRef 'sqlite'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBundled() {
                return create("sqlite.bundled");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidxActivity (1.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxActivity() { return getVersion("androidxActivity"); }

            /**
             * Returns the version associated to this alias: buildKonfig (0.15.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBuildKonfig() { return getVersion("buildKonfig"); }

            /**
             * Returns the version associated to this alias: coil (3.0.0-alpha06)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoil() { return getVersion("coil"); }

            /**
             * Returns the version associated to this alias: composeMultiplatform (1.7.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getComposeMultiplatform() { return getVersion("composeMultiplatform"); }

            /**
             * Returns the version associated to this alias: datastore (1.1.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDatastore() { return getVersion("datastore"); }

            /**
             * Returns the version associated to this alias: detekt (1.23.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDetekt() { return getVersion("detekt"); }

            /**
             * Returns the version associated to this alias: firebaseAppDistribution (5.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFirebaseAppDistribution() { return getVersion("firebaseAppDistribution"); }

            /**
             * Returns the version associated to this alias: firebaseBOM (33.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFirebaseBOM() { return getVersion("firebaseBOM"); }

            /**
             * Returns the version associated to this alias: firebaseCrashlytics (3.0.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFirebaseCrashlytics() { return getVersion("firebaseCrashlytics"); }

            /**
             * Returns the version associated to this alias: firebasePerformance (1.4.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFirebasePerformance() { return getVersion("firebasePerformance"); }

            /**
             * Returns the version associated to this alias: googleServices (4.4.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGoogleServices() { return getVersion("googleServices"); }

            /**
             * Returns the version associated to this alias: gradle (8.1.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGradle() { return getVersion("gradle"); }

            /**
             * Returns the version associated to this alias: kmpPalette (3.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKmpPalette() { return getVersion("kmpPalette"); }

            /**
             * Returns the version associated to this alias: koinAndroid (3.5.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKoinAndroid() { return getVersion("koinAndroid"); }

            /**
             * Returns the version associated to this alias: koinAndroidxCompose (3.5.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKoinAndroidxCompose() { return getVersion("koinAndroidxCompose"); }

            /**
             * Returns the version associated to this alias: koinCompose (1.1.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKoinCompose() { return getVersion("koinCompose"); }

            /**
             * Returns the version associated to this alias: koinComposeViewModel (1.2.0-Beta5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKoinComposeViewModel() { return getVersion("koinComposeViewModel"); }

            /**
             * Returns the version associated to this alias: koinCore (3.5.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKoinCore() { return getVersion("koinCore"); }

            /**
             * Returns the version associated to this alias: kotlin (2.1.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: kotlinxCoroutines (1.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxCoroutines() { return getVersion("kotlinxCoroutines"); }

            /**
             * Returns the version associated to this alias: kotlinxDateTime (0.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxDateTime() { return getVersion("kotlinxDateTime"); }

            /**
             * Returns the version associated to this alias: kotlinxSerializationJson (1.7.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxSerializationJson() { return getVersion("kotlinxSerializationJson"); }

            /**
             * Returns the version associated to this alias: ksp (2.1.10-1.0.31)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKsp() { return getVersion("ksp"); }

            /**
             * Returns the version associated to this alias: ktLint (11.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtLint() { return getVersion("ktLint"); }

            /**
             * Returns the version associated to this alias: ktor (2.3.12)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtor() { return getVersion("ktor"); }

            /**
             * Returns the version associated to this alias: leakCanary (2.12)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLeakCanary() { return getVersion("leakCanary"); }

            /**
             * Returns the version associated to this alias: material3Adaptive (1.0.0-alpha03)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial3Adaptive() { return getVersion("material3Adaptive"); }

            /**
             * Returns the version associated to this alias: mockk (1.13.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMockk() { return getVersion("mockk"); }

            /**
             * Returns the version associated to this alias: napier (2.7.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNapier() { return getVersion("napier"); }

            /**
             * Returns the version associated to this alias: navigation (2.7.0-alpha07)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigation() { return getVersion("navigation"); }

            /**
             * Returns the version associated to this alias: paging (3.3.0-alpha02-0.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPaging() { return getVersion("paging"); }

            /**
             * Returns the version associated to this alias: room (2.7.0-rc03)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

            /**
             * Returns the version associated to this alias: sdpSsp (1.0.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSdpSsp() { return getVersion("sdpSsp"); }

            /**
             * Returns the version associated to this alias: sqlite (2.5.0-SNAPSHOT)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSqlite() { return getVersion("sqlite"); }

            /**
             * Returns the version associated to this alias: turbine (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTurbine() { return getVersion("turbine"); }

            /**
             * Returns the version associated to this alias: version (0.51.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("version"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for coil which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.coil-kt.coil3:coil-compose-core</li>
             *    <li>io.coil-kt.coil3:coil-compose</li>
             *    <li>io.coil-kt.coil3:coil-network-ktor</li>
             *    <li>io.coil-kt.coil3:coil</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getCoil() {
                return createBundle("coil");
            }

            /**
             * Creates a dependency bundle provider for kmpPalette which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.kmpalette:kmpalette-core</li>
             *    <li>com.kmpalette:extensions-network</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getKmpPalette() {
                return createBundle("kmpPalette");
            }

            /**
             * Creates a dependency bundle provider for ktor which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.ktor:ktor-client-core</li>
             *    <li>io.ktor:ktor-client-content-negotiation</li>
             *    <li>io.ktor:ktor-serialization-kotlinx-json</li>
             *    <li>io.ktor:ktor-client-logging</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getKtor() {
                return createBundle("ktor");
            }

            /**
             * Creates a dependency bundle provider for paging which is an aggregate for the following dependencies:
             * <ul>
             *    <li>app.cash.paging:paging-common</li>
             *    <li>app.cash.paging:paging-compose-common</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getPaging() {
                return createBundle("paging");
            }

    }

    public static class PluginAccessors extends PluginFactory {
        private final AndroidPluginAccessors paccForAndroidPluginAccessors = new AndroidPluginAccessors(providers, config);
        private final ComposePluginAccessors paccForComposePluginAccessors = new ComposePluginAccessors(providers, config);
        private final FirebasePluginAccessors paccForFirebasePluginAccessors = new FirebasePluginAccessors(providers, config);
        private final GoogleServicesPluginAccessors paccForGoogleServicesPluginAccessors = new GoogleServicesPluginAccessors(providers, config);
        private final KotlinXPluginAccessors paccForKotlinXPluginAccessors = new KotlinXPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for buildKonfig to the plugin id 'com.codingfeline.buildkonfig'
             * with versionRef 'buildKonfig'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getBuildKonfig() { return createPlugin("buildKonfig"); }

            /**
             * Creates a plugin provider for detekt to the plugin id 'io.gitlab.arturbosch.detekt'
             * with versionRef 'detekt'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getDetekt() { return createPlugin("detekt"); }

            /**
             * Creates a plugin provider for jvm to the plugin id 'org.jetbrains.kotlin.jvm'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getJvm() { return createPlugin("jvm"); }

            /**
             * Creates a plugin provider for ksp to the plugin id 'com.google.devtools.ksp'
             * with versionRef 'ksp'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKsp() { return createPlugin("ksp"); }

            /**
             * Creates a plugin provider for ktLint to the plugin id 'org.jlleitschuh.gradle.ktlint'
             * with versionRef 'ktLint'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKtLint() { return createPlugin("ktLint"); }

            /**
             * Creates a plugin provider for multiplatform to the plugin id 'org.jetbrains.kotlin.multiplatform'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getMultiplatform() { return createPlugin("multiplatform"); }

            /**
             * Creates a plugin provider for room to the plugin id 'androidx.room'
             * with versionRef 'room'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getRoom() { return createPlugin("room"); }

            /**
             * Creates a plugin provider for version to the plugin id 'com.github.ben-manes.versions'
             * with versionRef 'version'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getVersion() { return createPlugin("version"); }

        /**
         * Returns the group of plugins at plugins.android
         */
        public AndroidPluginAccessors getAndroid() {
            return paccForAndroidPluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.compose
         */
        public ComposePluginAccessors getCompose() {
            return paccForComposePluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.firebase
         */
        public FirebasePluginAccessors getFirebase() {
            return paccForFirebasePluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.googleServices
         */
        public GoogleServicesPluginAccessors getGoogleServices() {
            return paccForGoogleServicesPluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.kotlinX
         */
        public KotlinXPluginAccessors getKotlinX() {
            return paccForKotlinXPluginAccessors;
        }

    }

    public static class AndroidPluginAccessors extends PluginFactory {

        public AndroidPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for android.application to the plugin id 'com.android.application'
             * with versionRef 'gradle'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApplication() { return createPlugin("android.application"); }

            /**
             * Creates a plugin provider for android.kotlin to the plugin id 'org.jetbrains.kotlin.android'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlin() { return createPlugin("android.kotlin"); }

            /**
             * Creates a plugin provider for android.library to the plugin id 'com.android.library'
             * with versionRef 'gradle'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getLibrary() { return createPlugin("android.library"); }

    }

    public static class ComposePluginAccessors extends PluginFactory  implements PluginNotationSupplier{

        public ComposePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for compose to the plugin id 'org.jetbrains.compose'
             * with versionRef 'composeMultiplatform'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> asProvider() { return createPlugin("compose"); }

            /**
             * Creates a plugin provider for compose.compiler to the plugin id 'org.jetbrains.kotlin.plugin.compose'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getCompiler() { return createPlugin("compose.compiler"); }

    }

    public static class FirebasePluginAccessors extends PluginFactory {
        private final FirebaseAppDistributionPluginAccessors paccForFirebaseAppDistributionPluginAccessors = new FirebaseAppDistributionPluginAccessors(providers, config);
        private final FirebaseCrashlyticsPluginAccessors paccForFirebaseCrashlyticsPluginAccessors = new FirebaseCrashlyticsPluginAccessors(providers, config);
        private final FirebasePerformancePluginAccessors paccForFirebasePerformancePluginAccessors = new FirebasePerformancePluginAccessors(providers, config);

        public FirebasePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.firebase.appDistribution
         */
        public FirebaseAppDistributionPluginAccessors getAppDistribution() {
            return paccForFirebaseAppDistributionPluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.firebase.crashlytics
         */
        public FirebaseCrashlyticsPluginAccessors getCrashlytics() {
            return paccForFirebaseCrashlyticsPluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.firebase.performance
         */
        public FirebasePerformancePluginAccessors getPerformance() {
            return paccForFirebasePerformancePluginAccessors;
        }

    }

    public static class FirebaseAppDistributionPluginAccessors extends PluginFactory {

        public FirebaseAppDistributionPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for firebase.appDistribution.plugin to the plugin id 'com.google.firebase.appdistribution'
             * with versionRef 'firebaseAppDistribution'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getPlugin() { return createPlugin("firebase.appDistribution.plugin"); }

    }

    public static class FirebaseCrashlyticsPluginAccessors extends PluginFactory {

        public FirebaseCrashlyticsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for firebase.crashlytics.plugin to the plugin id 'com.google.firebase.crashlytics'
             * with versionRef 'firebaseCrashlytics'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getPlugin() { return createPlugin("firebase.crashlytics.plugin"); }

    }

    public static class FirebasePerformancePluginAccessors extends PluginFactory {

        public FirebasePerformancePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for firebase.performance.plugin to the plugin id 'com.google.firebase.firebase-perf'
             * with versionRef 'firebasePerformance'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getPlugin() { return createPlugin("firebase.performance.plugin"); }

    }

    public static class GoogleServicesPluginAccessors extends PluginFactory {

        public GoogleServicesPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for googleServices.plugin to the plugin id 'com.google.gms.google-services'
             * with versionRef 'googleServices'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getPlugin() { return createPlugin("googleServices.plugin"); }

    }

    public static class KotlinXPluginAccessors extends PluginFactory {
        private final KotlinXSerializationPluginAccessors paccForKotlinXSerializationPluginAccessors = new KotlinXSerializationPluginAccessors(providers, config);

        public KotlinXPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.kotlinX.serialization
         */
        public KotlinXSerializationPluginAccessors getSerialization() {
            return paccForKotlinXSerializationPluginAccessors;
        }

    }

    public static class KotlinXSerializationPluginAccessors extends PluginFactory {

        public KotlinXSerializationPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for kotlinX.serialization.plugin to the plugin id 'org.jetbrains.kotlin.plugin.serialization'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getPlugin() { return createPlugin("kotlinX.serialization.plugin"); }

    }

}
