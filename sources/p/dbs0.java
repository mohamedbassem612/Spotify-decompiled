package p;

import android.content.Context;
import android.content.pm.PackageManager;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$PreparePaymentRequest;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$ProceedData;
import com.spotify.payment.endpoint.proto.a0;
import com.spotify.payment.endpoint.proto.z;
import io.reactivex.rxjava3.functions.Function;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dbs0 implements Function {
    public final /* synthetic */ gbs0 a;

    public dbs0(gbs0 gbs0Var) {
        this.a = gbs0Var;
    }

    public final Object apply(Object obj) {
        vfw vfwVar = (vfw) obj;
        i3g1 i3g1Var = vfwVar.c;
        String str = vfwVar.a;
        gbs0 gbs0Var = this.a;
        fcs0 fcs0Var = gbs0Var.a;
        pcs0 pcs0VarN = PaymentSdkNativeServiceProto$PreparePaymentRequest.n();
        pcs0VarN.w(str);
        pcs0VarN.t(vfwVar.b);
        String str2 = vfwVar.e;
        pcs0VarN.v(str2);
        Context context = gbs0Var.b.a;
        Set setA = tas0.a(str2);
        boolean z = false;
        if (!setA.isEmpty()) {
            Set set = setA;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        context.getPackageManager().getApplicationInfo((String) it.next(), 0);
                        if (!mb4.d(context)) {
                            break;
                        }
                        z = true;
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
        }
        pcs0VarN.n(z);
        pcs0VarN.r(vfwVar.d);
        z zVarN = PaymentSdkNativeServiceProto$ProceedData.n();
        a0 a0VarO = PaymentSdkNativeServiceProto$ProceedData.FormData.o();
        a0VarO.q(vfwVar.f);
        a0VarO.n(vfwVar.g);
        zVarN.n(a0VarO);
        pcs0VarN.x((PaymentSdkNativeServiceProto$ProceedData) zVarN.build());
        pcs0VarN.y(vfwVar.h);
        String str3 = i3g1Var.a;
        if (str3 != null) {
            pcs0VarN.s(str3);
        }
        String str4 = i3g1Var.b;
        if (str4 != null) {
            pcs0VarN.u(str4);
        }
        String str5 = i3g1Var.c;
        if (str5 != null) {
            pcs0VarN.q(str5);
        }
        return fcs0Var.e((PaymentSdkNativeServiceProto$PreparePaymentRequest) pcs0VarN.build(), vfwVar.i).map(new sjq0(str, gbs0Var, vfwVar)).onErrorReturn(new t8r0(str, vfwVar));
    }
}
