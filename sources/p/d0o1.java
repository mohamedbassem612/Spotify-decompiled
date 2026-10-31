package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d0o1 extends w4o1 {
    public final /* synthetic */ Context e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ u6o1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0o1(u6o1 u6o1Var, Context context, Bundle bundle) {
        super(u6o1Var, true);
        this.e = context;
        this.f = bundle;
        this.g = u6o1Var;
    }

    @Override // p.w4o1
    public final void a() {
        try {
            Context context = this.e;
            zod.s(context);
            String strA = ijo1.A(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = ijo1.A(context);
            }
            Boolean boolB = ijo1.B(resources, strA);
            u6o1 u6o1Var = this.g;
            svn1 kvn1Var = null;
            try {
                IBinder iBinderB = gjv.c(context, boolB == null || !boolB.booleanValue() ? gjv.d : gjv.c, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService");
                int i = rvn1.l;
                if (iBinderB != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
                    kvn1Var = iInterfaceQueryLocalInterface instanceof svn1 ? (svn1) iInterfaceQueryLocalInterface : new kvn1(iBinderB);
                }
            } catch (DynamiteModule$LoadingException e) {
                u6o1Var.b(e, true, false);
            }
            u6o1Var.f = kvn1Var;
            if (u6o1Var.f == null) {
                return;
            }
            int iA = gjv.a(context, "com.google.android.gms.measurement.dynamite");
            int iD = gjv.d(context, "com.google.android.gms.measurement.dynamite", false);
            int iMax = Math.max(iA, iD);
            boolean z = Boolean.TRUE.equals(boolB) || iD < iA;
            long j = iMax;
            u6o1Var.g = j;
            u9 eyn1Var = new eyn1(161000L, j, z, this.f, ijo1.A(context));
            boolean z2 = u6o1Var.g >= 169;
            svn1 svn1Var = u6o1Var.f;
            if (!z2) {
                zod.s(svn1Var);
                qfp0 qfp0Var = new qfp0(context);
                long j2 = this.a;
                kvn1 kvn1Var2 = (kvn1) svn1Var;
                Parcel parcelS = kvn1Var2.s();
                drn1.b(parcelS, qfp0Var);
                drn1.a(parcelS, eyn1Var);
                parcelS.writeLong(j2);
                kvn1Var2.B0(1, parcelS);
                return;
            }
            zod.s(svn1Var);
            qfp0 qfp0Var2 = new qfp0(context);
            long j3 = this.a;
            long j4 = this.b;
            kvn1 kvn1Var3 = (kvn1) svn1Var;
            Parcel parcelS2 = kvn1Var3.s();
            drn1.b(parcelS2, qfp0Var2);
            drn1.a(parcelS2, eyn1Var);
            parcelS2.writeLong(j3);
            parcelS2.writeLong(j4);
            kvn1Var3.B0(60, parcelS2);
        } catch (Exception e2) {
            this.g.b(e2, true, false);
        }
    }
}
