package p;

import android.content.Context;
import android.graphics.Rect;
import android.media.SoundPool;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gga1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gga1(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((hga1) obj).dismiss();
                return rih1Var;
            case 1:
                zja1 zja1Var = (zja1) obj;
                SoundPool soundPool = (SoundPool) zja1Var.b.get();
                soundPool.setOnLoadCompleteListener(new yja1(zja1Var));
                return soundPool;
            case 2:
                ze21 ze21Var = (ze21) obj;
                iu30 iu30Var = ze21Var.d;
                Rect rect = new Rect();
                ze21Var.e.getGlobalVisibleRect(rect);
                iu30Var.invoke(new csa1(new bsa1(rect.left, rect.top, rect.right, rect.bottom)));
                return rih1Var;
            case 3:
                zwa1 zwa1Var = (zwa1) obj;
                jnq jnqVar = (jnq) zwa1Var.b.a.b;
                luk lukVar = (luk) ((d1q) jnqVar.b).a.L1.get();
                c8o.l(lukVar);
                return new xzq(new nm1(new uq8(new jq4(lukVar), (byte) 2), ((gl90) jnqVar.d).b, ((qop) jnqVar.c).d(), ((d1q) jnqVar.b).a.j2()), new qd81(zwa1Var, (byte) 7));
            case 4:
                return Float.valueOf(((Number) ((tob1) ((g2z) obj).a).getValue()).floatValue());
            case 5:
                return new kpg0((xpw) ((q0b1) obj).a.get(), qva1.b1);
            case 6:
                thq thqVar = ((wiq) obj).a;
                return new c1b1(thqVar.c.b.T0(), (ao0) thqVar.b.Hk.get());
            case 7:
                ((SpotifyAlarmLauncherService) obj).stopSelf();
                return rih1Var;
            case 8:
                j0d1 j0d1VarB = guo1.B();
                kly0 kly0Var = ((m2b1) obj).f;
                if (kly0Var != null) {
                    return smo1.e(flo1.l(j0d1VarB, (o8n) kly0Var.get()));
                }
                u890.C("mainImmediateDispatcher");
                throw null;
            case 9:
                r2b1 r2b1Var = (r2b1) obj;
                fn31.T(r2b1Var.i, (o8n) null, 0, new xba1(r2b1Var, (lnm) null, (byte) 6), 3);
                return rih1Var;
            case 10:
                jly0 jly0Var = ((SpotifyMediaLibraryService) obj).Y;
                if (jly0Var != null) {
                    return (d6b1) jly0Var.get();
                }
                u890.C("providedMediaSessionWrapperProvider");
                throw null;
            case 11:
                bcb1 bcb1Var = (bcb1) obj;
                rrq rrqVar = bcb1Var.b;
                jha1 jha1Var = new jha1(bcb1Var.c.b, (byte) 4);
                bpb1 bpb1Var = bcb1Var.f;
                bpb1 bpb1Var2 = bcb1Var.i;
                mr20 mr20VarI = t5p1.i(w6d1.q(awl1.d(bcb1Var.d.a).e(rqo1.s(bcb1Var.a)), ec61.Q0));
                a1q a1qVar = (a1q) rrqVar.a.b;
                f1n0 f1n0Var = (f1n0) ((zzp) a1qVar.b).a.T2.get();
                c8o.l(f1n0Var);
                zzp zzpVar = (zzp) a1qVar.b;
                mnk0 mnk0Var = (mnk0) zzpVar.a.b6.get();
                c8o.l(mnk0Var);
                aqv aqvVar = (aqv) zzpVar.a.x6.get();
                c8o.l(aqvVar);
                return new kpg0(new res(f1n0Var, mnk0Var, aqvVar, bpb1Var2, bpb1Var, jha1Var, mr20VarI), new l5b1(bcb1Var, (byte) 5));
            case 12:
                ca3 ca3Var = (ca3) obj;
                return new xzq((n0o) ca3Var.b, new l5b1(ca3Var, (byte) 7));
            case 13:
                gcb1 gcb1Var = (gcb1) obj;
                return new kpg0(gcb1Var.b.a(gcb1Var.c), v3b1.X0);
            case 14:
                zne zneVar = (zne) obj;
                goq goqVar = (goq) ((trq) zneVar.d).a.c;
                d0r d0rVar = ((tbt) goqVar.g).a;
                String strD = ((qop) goqVar.e).d();
                daq daqVar = ((k0q) goqVar.f).a;
                Context context = (Context) daqVar.x1.a;
                c8o.l(context);
                boolean zS = bno1.s(context);
                luk lukVar2 = (luk) daqVar.L1.get();
                c8o.l(lukVar2);
                return new xzq(new xjj0(d0rVar, strD, zS, new dq4(false, lukVar2), (pop) ((jly0) goqVar.b).get(), (lmq) ((jly0) goqVar.c).get()), new l5b1(zneVar, (byte) 9));
            case 15:
                edb1 edb1Var = (edb1) obj;
                eq4 eq4Var = edb1Var.N0;
                yzc0 yzc0Var = edb1Var.c;
                if (eq4Var.b()) {
                    return new xzq(edb1Var.Y.a(edb1Var.b, new ult0(yzc0Var)), v3b1.d1);
                }
                if (!edb1Var.h.d) {
                    return new kpg0(edb1Var.t.a(new p9n0(yzc0Var, edb1Var), new u9a1(3, (lnm) null, (byte) 2)), v3b1.e1);
                }
                return new kpg0(new umf0(new m4c((byte) 16), (mnk0) edb1Var.Z.a.c.b6.get(), new p9n0(yzc0Var, edb1Var), new u9a1(3, (lnm) null, (byte) 1)), new qd81(edb1Var, (byte) 13));
            case 16:
                wdb1 wdb1Var = (wdb1) obj;
                wrq wrqVar = wdb1Var.c;
                d0r d0rVar2 = wdb1Var.a;
                vr51 vr51Var = wdb1Var.f;
                jnq jnqVar2 = (jnq) wrqVar.a.b;
                yk90 yk90Var = ((fl90) jnqVar2.c).f;
                String strD2 = ((qop) jnqVar2.b).d();
                mta mtaVar = new mta((byte) 26);
                l3q l3qVar = (l3q) jnqVar2.d;
                teq teqVar = l3qVar.b;
                ux3 ux3Var = (ux3) teqVar.d8.get();
                c8o.l(ux3Var);
                daq daqVar2 = l3qVar.a;
                luk lukVar3 = (luk) daqVar2.L1.get();
                c8o.l(lukVar3);
                xx4 xx4Var = new xx4(false, false, lukVar3);
                luk lukVar4 = (luk) daqVar2.L1.get();
                c8o.l(lukVar4);
                return new wqw(new xzq(new dgb1(yk90Var, strD2, mtaVar, ux3Var, xx4Var, new jq4(lukVar4).j(), teqVar.Y0(), new a5m(), d0rVar2, vr51Var), new l5b1(wdb1Var, (byte) 11)));
            case 17:
                return new xv81((maa1) obj);
            case 18:
                meb1 meb1Var = (meb1) obj;
                return new xzq(meb1Var.b, new l5b1(meb1Var, (byte) 12));
            case 19:
                peb1 peb1Var = (peb1) obj;
                return new xzq(peb1Var.b, new oeb1(peb1Var, (byte) 1));
            case 20:
                teb1 teb1Var = (teb1) obj;
                return new xzq((hw2) teb1Var.e, new reb1(teb1Var, (byte) 1));
            case 21:
                teb1 teb1Var2 = (teb1) obj;
                return new xzq((nm1) teb1Var2.e, new veb1(teb1Var2, (byte) 1));
            case 22:
                return (l13) ((jxp) obj).get();
            case 23:
                return flo1.l(((vhb1) obj).f, guo1.B());
            case 24:
                ((vhb1) ((km0) obj).c).a();
                return rih1Var;
            case 25:
                zjb1 zjb1Var = (zjb1) obj;
                return zjb1Var.b.a(((f0i) zjb1Var.a).a).d();
            case 26:
                dgo1.r((ConstraintLayout) obj, false);
                return rih1Var;
            case 27:
                v5b1 v5b1Var = ((s4b1) obj).d;
                return Boolean.valueOf(u890.j(v5b1Var != null ? v5b1Var.getType() : null, bzu0.f));
            case 28:
                wbc1 wbc1Var = (wbc1) obj;
                if (wbc1Var.e.h()) {
                    wbc1Var.d.a(fcl1.a);
                }
                return rih1Var;
            default:
                bcc1 bcc1Var = (bcc1) obj;
                esa1 esa1Var = bcc1Var.a;
                pcc1 pcc1Var = bcc1Var.c;
                return MobiusLoopViewModel.T(new zcc1((ncc1) esa1Var.b), new occ1(pcc1Var.b, pcc1Var.c, pcc1Var.d, pcc1Var.e, pcc1Var.f, pcc1Var.a), new ejb((dgb) esa1Var.c, (byte) 26));
        }
    }
}
