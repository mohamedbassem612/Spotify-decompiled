package com.ravelin.core.repository.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.ravelin.core.repository.db.AppDatabase;
import com.ravelin.core.repository.services.DeviceIdService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.bn31;
import p.cce;
import p.en31;
import p.idd1;
import p.mqt;
import p.trj0;
import p.u890;
import p.y52;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ravelin/core/repository/services/DeviceIdService;", "Landroid/app/Service;", "<init>", "()V", "p/mqt", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class DeviceIdService extends Service {
    public static final String d;
    public AppDatabase a;
    public final idd1 b;
    public final idd1 c;

    static {
        String canonicalName = DeviceIdService.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "DeviceIdService";
        }
        d = canonicalName;
    }

    public DeviceIdService() {
        final byte b = 0;
        this.b = new idd1(new Function0(this) { // from class: p.lqt
            public final /* synthetic */ DeviceIdService b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                DeviceIdService deviceIdService = this.b;
                switch (b2) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        String str = DeviceIdService.d;
                        return deviceIdService.a().u();
                    default:
                        String str2 = DeviceIdService.d;
                        return deviceIdService.getBaseContext().getPackageName();
                }
            }
        });
        final byte b2 = 1;
        this.c = new idd1(new Function0(this) { // from class: p.lqt
            public final /* synthetic */ DeviceIdService b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b2;
                DeviceIdService deviceIdService = this.b;
                switch (b3) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        String str = DeviceIdService.d;
                        return deviceIdService.a().u();
                    default:
                        String str2 = DeviceIdService.d;
                        return deviceIdService.getBaseContext().getPackageName();
                }
            }
        });
    }

    public final AppDatabase a() {
        AppDatabase appDatabase = this.a;
        if (appDatabase != null) {
            return appDatabase;
        }
        u890.C("deviceIdsDb");
        throw null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 1089396910 && action.equals("com.ravelin.core.SERVICE_DEVICE_ACTION")) {
            return new mqt(this);
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        bn31 bn31VarT = u890.t(this, AppDatabase.class, "com.ravelin.sdk.device");
        bn31VarT.i = true;
        bn31VarT.a(new trj0[]{AppDatabase.l, AppDatabase.m, AppDatabase.n, AppDatabase.o});
        this.a = (AppDatabase) bn31VarT.c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        cce cceVar = ((en31) a()).g;
        synchronized (cceVar) {
            if (((AtomicBoolean) cceVar.d).compareAndSet(false, true)) {
                while (((AtomicInteger) cceVar.c).get() != 0) {
                }
                ((y52) cceVar.b).invoke();
            }
        }
        super.onDestroy();
    }
}
