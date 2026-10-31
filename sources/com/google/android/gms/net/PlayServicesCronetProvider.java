package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import p.bhn0;
import p.f8o;
import p.gjv;
import p.k220;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            f8o.a(this.mContext);
        } catch (GooglePlayServicesNotAvailableException unused) {
            Log.isLoggable(TAG, 4);
        } catch (GooglePlayServicesRepairableException unused2) {
            Log.isLoggable(TAG, 4);
        }
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        gjv gjvVar;
        try {
            f8o.a(this.mContext);
            try {
                synchronized (f8o.b) {
                    gjvVar = f8o.c;
                }
                zod.s(gjvVar);
                ClassLoader classLoader = gjvVar.a.getClassLoader();
                zod.s(classLoader);
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
                e = null;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                e = e;
                builder = null;
            }
            if (e == null) {
                zod.t(builder, "The value of the constructed builder should never be null");
                return builder;
            }
            bhn0.o("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            return null;
        } catch (GooglePlayServicesRepairableException e2) {
            k220.p("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e2);
            return null;
        } catch (GooglePlayServicesNotAvailableException e3) {
            k220.p("Google Play Services Cronet provider is unavailable on this device.", e3);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (f8o.b) {
            str = f8o.d;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        gjv gjvVar;
        tryToInstallCronetProvider();
        synchronized (f8o.b) {
            gjvVar = f8o.c;
        }
        return gjvVar != null;
    }
}
