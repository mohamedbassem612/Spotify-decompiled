package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.mediasession.mediasession.login.AfterLoginDummyActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rq4 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rq4(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 3;
        Object obj = this.b;
        switch (b) {
            case 0:
                sq4 sq4Var = (sq4) obj;
                luk lukVar = sq4Var.f;
                if (lukVar != null) {
                    return (sq4) lukVar.e(new aq4(sq4Var, (byte) 16));
                }
                return null;
            case 1:
                tq4 tq4Var = (tq4) obj;
                luk lukVar2 = tq4Var.b;
                if (lukVar2 != null) {
                    return (tq4) lukVar2.e(new aq4(tq4Var, (byte) 17));
                }
                return null;
            case 2:
                uq4 uq4Var = (uq4) obj;
                luk lukVar3 = uq4Var.b;
                if (lukVar3 != null) {
                    return lukVar3.e(new aq4(uq4Var, (byte) 18));
                }
                return null;
            case 3:
                vq4 vq4Var = (vq4) obj;
                luk lukVar4 = vq4Var.d;
                if (lukVar4 != null) {
                    return lukVar4.e(new aq4(vq4Var, (byte) 19));
                }
                return null;
            case 4:
                wq4 wq4Var = (wq4) obj;
                luk lukVar5 = wq4Var.b;
                if (lukVar5 != null) {
                    return lukVar5.e(new aq4(wq4Var, (byte) 20));
                }
                return null;
            case 5:
                ar4 ar4Var = (ar4) obj;
                luk lukVar6 = ar4Var.b;
                if (lukVar6 != null) {
                    return (ar4) lukVar6.e(new aq4(ar4Var, (byte) 21));
                }
                return null;
            case 6:
                br4 br4Var = (br4) obj;
                luk lukVar7 = br4Var.c;
                if (lukVar7 != null) {
                    return (br4) lukVar7.e(new aq4(br4Var, (byte) 22));
                }
                return null;
            case 7:
                cr4 cr4Var = (cr4) obj;
                luk lukVar8 = cr4Var.d;
                if (lukVar8 != null) {
                    return (cr4) lukVar8.e(new aq4(cr4Var, (byte) 23));
                }
                return null;
            case 8:
                dr4 dr4Var = (dr4) obj;
                luk lukVar9 = dr4Var.d;
                if (lukVar9 != null) {
                    return lukVar9.e(new aq4(dr4Var, (byte) 24));
                }
                return null;
            case 9:
                er4 er4Var = (er4) obj;
                luk lukVar10 = er4Var.c;
                if (lukVar10 != null) {
                    return lukVar10.e(new aq4(er4Var, (byte) 25));
                }
                return null;
            case 10:
                gr4 gr4Var = (gr4) obj;
                luk lukVar11 = gr4Var.i;
                if (lukVar11 != null) {
                    return lukVar11.e(new aq4(gr4Var, (byte) 26));
                }
                return null;
            case 11:
                hr4 hr4Var = (hr4) obj;
                luk lukVar12 = hr4Var.c;
                if (lukVar12 != null) {
                    return lukVar12.e(new aq4(hr4Var, (byte) 27));
                }
                return null;
            case 12:
                kr4 kr4Var = (kr4) obj;
                luk lukVar13 = kr4Var.b;
                if (lukVar13 != null) {
                    return lukVar13.e(new aq4(kr4Var, (byte) 28));
                }
                return null;
            case 13:
                mr4 mr4Var = (mr4) obj;
                luk lukVar14 = mr4Var.z;
                if (lukVar14 != null) {
                    return lukVar14.e(new aq4(mr4Var, (byte) 29));
                }
                return null;
            case 14:
                pr4 pr4Var = (pr4) obj;
                luk lukVar15 = pr4Var.c;
                if (lukVar15 != null) {
                    return (pr4) lukVar15.e(new nr4(pr4Var, (byte) 1));
                }
                return null;
            case 15:
                xr4 xr4Var = (xr4) obj;
                luk lukVar16 = xr4Var.d;
                if (lukVar16 != null) {
                    return lukVar16.e(new nr4(xr4Var, (byte) 2));
                }
                return null;
            case 16:
                Bundle bundle = new Bundle(3);
                d520 d520Var = (d520) obj;
                Context context = (Context) d520Var.b;
                n801 n801Var = (n801) d520Var.d;
                Context applicationContext = context.getApplicationContext();
                int i = AfterLoginDummyActivity.a;
                Intent intent = new Intent(applicationContext, (Class<?>) AfterLoginDummyActivity.class);
                intent.setAction("android.intent.action.VIEW");
                intent.addFlags(1082130432);
                intent.setPackage(context.getPackageName());
                PendingIntent activity = PendingIntent.getActivity(context, 0, u2f0.a((u2f0) n801Var.b, context, intent, false, (Uri) null, 268435456, 0, 64), 67108864);
                bundle.putString("android.media.extras.ERROR_RESOLUTION_ACTION_LABEL", context.getString(2131957670));
                bundle.putParcelable("android.media.extras.ERROR_RESOLUTION_ACTION_INTENT", activity);
                return new r0i0(5, 0L, 0.0f, bundle, mgz.c, context.getString(2131952401, 110), 0, (y0i0) null, (w0i0) null, 0L, (j2i0) null, (ArrayList) null, (sp91) null, false, 16326);
            case 17:
                ys4 ys4Var = (ys4) obj;
                nn61 nn61Var = ys4Var.t;
                return new o791(ys4Var.c, (uu00) nn61Var.b, (uvy) nn61Var.c);
            case 18:
                at4 at4Var = (at4) obj;
                luk lukVar17 = at4Var.l;
                if (lukVar17 != null) {
                    return lukVar17.e(new nr4(at4Var, b2));
                }
                return null;
            case 19:
                bt4 bt4Var = (bt4) obj;
                luk lukVar18 = bt4Var.c;
                if (lukVar18 != null) {
                    return (bt4) lukVar18.e(new nr4(bt4Var, (byte) 4));
                }
                return null;
            case 20:
                ct4 ct4Var = (ct4) obj;
                luk lukVar19 = ct4Var.d;
                if (lukVar19 != null) {
                    return (ct4) lukVar19.e(new nr4(ct4Var, (byte) 5));
                }
                return null;
            case 21:
                ht4 ht4Var = (ht4) obj;
                luk lukVar20 = ht4Var.d;
                if (lukVar20 != null) {
                    return lukVar20.e(new nr4(ht4Var, (byte) 6));
                }
                return null;
            case 22:
                it4 it4Var = (it4) obj;
                luk lukVar21 = it4Var.o;
                if (lukVar21 != null) {
                    return lukVar21.e(new nr4(it4Var, (byte) 7));
                }
                return null;
            case 23:
                kt4 kt4Var = (kt4) obj;
                luk lukVar22 = kt4Var.c;
                if (lukVar22 != null) {
                    return lukVar22.e(new nr4(kt4Var, (byte) 8));
                }
                return null;
            case 24:
                lt4 lt4Var = (lt4) obj;
                luk lukVar23 = lt4Var.b;
                if (lukVar23 != null) {
                    return lukVar23.e(new nr4(lt4Var, (byte) 9));
                }
                return null;
            case 25:
                mt4 mt4Var = (mt4) obj;
                luk lukVar24 = mt4Var.c;
                if (lukVar24 != null) {
                    return (mt4) lukVar24.e(new nr4(mt4Var, (byte) 10));
                }
                return null;
            case 26:
                nt4 nt4Var = (nt4) obj;
                luk lukVar25 = nt4Var.b;
                if (lukVar25 != null) {
                    return (nt4) lukVar25.e(new nr4(nt4Var, (byte) 11));
                }
                return null;
            case 27:
                ot4 ot4Var = (ot4) obj;
                luk lukVar26 = ot4Var.c;
                if (lukVar26 != null) {
                    return (ot4) lukVar26.e(new nr4(ot4Var, (byte) 12));
                }
                return null;
            case 28:
                pt4 pt4Var = (pt4) obj;
                luk lukVar27 = pt4Var.b;
                if (lukVar27 != null) {
                    return (pt4) lukVar27.e(new nr4(pt4Var, (byte) 13));
                }
                return null;
            default:
                rt4 rt4Var = (rt4) obj;
                luk lukVar28 = rt4Var.c;
                if (lukVar28 != null) {
                    return lukVar28.e(new nr4(rt4Var, (byte) 14));
                }
                return null;
        }
    }
}
