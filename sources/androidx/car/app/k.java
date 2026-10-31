package androidx.car.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.CarAppMetadataHolderService;
import androidx.car.app.HostException;
import androidx.car.app.b;
import androidx.car.app.hardware.ProjectedCarHardwareManager;
import java.util.HashMap;
import java.util.Objects;
import p.bil;
import p.d431;
import p.dqd;
import p.eg;
import p.fe;
import p.fqd;
import p.hp41;
import p.r1q0;
import p.sge1;
import p.tac0;
import p.whg0;
import p.wp20;
import p.wth0;
import p.xhg0;
import p.xvc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k extends ContextWrapper {
    public final r1q0 a;
    public final l b;
    public final wp20 c;
    public VirtualDisplay d;
    public int e;

    public k(final tac0 tac0Var, final l lVar) {
        super(null);
        wp20 wp20Var = new wp20((byte) 25);
        this.c = wp20Var;
        this.d = null;
        final byte b = 0;
        this.e = 0;
        this.b = lVar;
        final byte b2 = 1;
        wp20Var.g(b.class, "app", new xhg0(this) { // from class: p.cqd
            public final /* synthetic */ androidx.car.app.k b;

            {
                this.b = this;
            }

            @Override // p.xhg0
            public final whg0 create() {
                byte b3 = b2;
                tac0 tac0Var2 = tac0Var;
                androidx.car.app.l lVar2 = lVar;
                androidx.car.app.k kVar = this.b;
                switch (b3) {
                    case 0:
                        return new wth0(kVar, lVar2, tac0Var2);
                    case 1:
                        return new b(kVar, lVar2, tac0Var2);
                    default:
                        return new androidx.car.app.navigation.b(kVar, lVar2, tac0Var2);
                }
            }
        });
        final byte b3 = 2;
        wp20Var.g(androidx.car.app.navigation.b.class, "navigation", new xhg0(this) { // from class: p.cqd
            public final /* synthetic */ androidx.car.app.k b;

            {
                this.b = this;
            }

            @Override // p.xhg0
            public final whg0 create() {
                byte b4 = b3;
                tac0 tac0Var2 = tac0Var;
                androidx.car.app.l lVar2 = lVar;
                androidx.car.app.k kVar = this.b;
                switch (b4) {
                    case 0:
                        return new wth0(kVar, lVar2, tac0Var2);
                    case 1:
                        return new b(kVar, lVar2, tac0Var2);
                    default:
                        return new androidx.car.app.navigation.b(kVar, lVar2, tac0Var2);
                }
            }
        });
        wp20Var.g(hp41.class, "screen", new xhg0(this) { // from class: p.eqd
            public final /* synthetic */ androidx.car.app.k b;

            {
                this.b = this;
            }

            @Override // p.xhg0
            public final whg0 create() {
                byte b4 = b3;
                Object obj = tac0Var;
                androidx.car.app.k kVar = this.b;
                switch (b4) {
                    case 0:
                        return new bil(kVar, (androidx.car.app.l) obj);
                    case 1:
                        androidx.car.app.l lVar2 = (androidx.car.app.l) obj;
                        if (kVar.d() < 3) {
                            throw new HostException("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
                        }
                        try {
                            int i = CarAppMetadataHolderService.a;
                            Bundle bundle = kVar.getPackageManager().getServiceInfo(new ComponentName(kVar, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                            String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
                            if (string != null) {
                                return (ProjectedCarHardwareManager) Class.forName(string).getConstructor(androidx.car.app.k.class, androidx.car.app.l.class).newInstance(kVar, lVar2);
                            }
                            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
                        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                            eg.m("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
                            return null;
                        }
                    default:
                        return new hp41(kVar, (tac0) obj);
                }
            }
        });
        wp20Var.g(bil.class, "constraints", new xhg0(this) { // from class: p.eqd
            public final /* synthetic */ androidx.car.app.k b;

            {
                this.b = this;
            }

            @Override // p.xhg0
            public final whg0 create() {
                byte b4 = b;
                Object obj = lVar;
                androidx.car.app.k kVar = this.b;
                switch (b4) {
                    case 0:
                        return new bil(kVar, (androidx.car.app.l) obj);
                    case 1:
                        androidx.car.app.l lVar2 = (androidx.car.app.l) obj;
                        if (kVar.d() < 3) {
                            throw new HostException("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
                        }
                        try {
                            int i = CarAppMetadataHolderService.a;
                            Bundle bundle = kVar.getPackageManager().getServiceInfo(new ComponentName(kVar, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                            String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
                            if (string != null) {
                                return (ProjectedCarHardwareManager) Class.forName(string).getConstructor(androidx.car.app.k.class, androidx.car.app.l.class).newInstance(kVar, lVar2);
                            }
                            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
                        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                            eg.m("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
                            return null;
                        }
                    default:
                        return new hp41(kVar, (tac0) obj);
                }
            }
        });
        wp20Var.g(ProjectedCarHardwareManager.class, "hardware", new xhg0(this) { // from class: p.eqd
            public final /* synthetic */ androidx.car.app.k b;

            {
                this.b = this;
            }

            @Override // p.xhg0
            public final whg0 create() {
                byte b4 = b2;
                Object obj = lVar;
                androidx.car.app.k kVar = this.b;
                switch (b4) {
                    case 0:
                        return new bil(kVar, (androidx.car.app.l) obj);
                    case 1:
                        androidx.car.app.l lVar2 = (androidx.car.app.l) obj;
                        if (kVar.d() < 3) {
                            throw new HostException("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
                        }
                        try {
                            int i = CarAppMetadataHolderService.a;
                            Bundle bundle = kVar.getPackageManager().getServiceInfo(new ComponentName(kVar, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                            String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
                            if (string != null) {
                                return (ProjectedCarHardwareManager) Class.forName(string).getConstructor(androidx.car.app.k.class, androidx.car.app.l.class).newInstance(kVar, lVar2);
                            }
                            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
                        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                            eg.m("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
                            return null;
                        }
                    default:
                        return new hp41(kVar, (tac0) obj);
                }
            }
        });
        wp20Var.g(d431.class, null, new fqd(this));
        wp20Var.g(xvc1.class, "suggestion", new fqd(this, lVar, tac0Var));
        wp20Var.g(wth0.class, "media_playback", new xhg0(this) { // from class: p.cqd
            public final /* synthetic */ androidx.car.app.k b;

            {
                this.b = this;
            }

            @Override // p.xhg0
            public final whg0 create() {
                byte b4 = b;
                tac0 tac0Var2 = tac0Var;
                androidx.car.app.l lVar2 = lVar;
                androidx.car.app.k kVar = this.b;
                switch (b4) {
                    case 0:
                        return new wth0(kVar, lVar2, tac0Var2);
                    case 1:
                        return new b(kVar, lVar2, tac0Var2);
                    default:
                        return new androidx.car.app.navigation.b(kVar, lVar2, tac0Var2);
                }
            }
        });
        this.a = new r1q0(new fe(this, (byte) 21));
        tac0Var.a(new dqd(this, lVar));
    }

    public final void c(Context context, Configuration configuration) {
        sge1.a();
        if (getBaseContext() == null) {
            Object systemService = context.getSystemService("display");
            Objects.requireNonNull(systemService);
            VirtualDisplay virtualDisplayCreateVirtualDisplay = ((DisplayManager) systemService).createVirtualDisplay("CarAppService", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8);
            this.d = virtualDisplayCreateVirtualDisplay;
            attachBaseContext(context.createDisplayContext(virtualDisplayCreateVirtualDisplay.getDisplay()).createConfigurationContext(configuration));
        }
        f(configuration);
    }

    public final int d() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        eg.m("Car App API level hasn't been established yet");
        return 0;
    }

    public final whg0 e(Class cls) {
        wp20 wp20Var = this.c;
        HashMap map = (HashMap) wp20Var.a;
        HashMap map2 = (HashMap) wp20Var.b;
        RuntimeException runtimeException = (RuntimeException) map2.get(cls);
        if (runtimeException != null) {
            throw runtimeException;
        }
        whg0 whg0Var = (whg0) map.get(cls);
        if (whg0Var != null) {
            return whg0Var;
        }
        xhg0 xhg0Var = (xhg0) ((HashMap) wp20Var.c).get(cls);
        if (xhg0Var == null) {
            eg.n("The class '", cls, "' does not correspond to a car service");
            return null;
        }
        try {
            whg0 whg0VarCreate = xhg0Var.create();
            map.put(cls, whg0VarCreate);
            return whg0VarCreate;
        } catch (RuntimeException e) {
            map2.put(cls, e);
            throw e;
        }
    }

    public final void f(Configuration configuration) {
        sge1.a();
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(configuration);
            Objects.toString(getResources().getDisplayMetrics());
        }
        Resources resources = getResources();
        Objects.requireNonNull(configuration);
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
    }
}
