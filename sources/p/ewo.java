package p;

import android.app.Activity;
import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ewo implements jly0 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ewo(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                wzn wznVar = (wzn) obj;
                if (z) {
                    if (z) {
                        return pzm.h((mos) ((r2) wznVar.b).d.get());
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                String str = ((u2) wznVar.a).a;
                if (str != null && str.length() != 0) {
                    kik1 kik1Var = nik1.Q4;
                    if (kik1Var.a(str)) {
                        return kik1Var.b(str);
                    }
                }
                if (str != null && str.length() != 0) {
                    kik1 kik1Var2 = nik1.Y;
                    if (kik1Var2.a(str)) {
                        return kik1Var2.b(str);
                    }
                }
                eg.m(l1d.m("Attempt to create About Page with invalid URI: ", str));
                return null;
            case 1:
                if (!z) {
                    return new kwo(this);
                }
                if (z) {
                    return u1n0.z((q7r0) ((wzn) obj).b);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 2:
                wzn wznVar2 = (wzn) obj;
                w52 w52Var = (w52) wznVar2.a;
                if (z) {
                    if (z) {
                        return pzm.h((mos) w52Var.b.get());
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                Context context = (Context) w52Var.d.get();
                c8o.l(context);
                los losVar = (los) ((jly0) wznVar2.c).get();
                lzn0 lzn0Var = (lzn0) w52Var.c.get();
                c8o.l(lzn0Var);
                x52 x52Var = (x52) wznVar2.b;
                ce31 ce31Var = (ce31) w52Var.e.get();
                c8o.l(ce31Var);
                return new res(context, losVar, lzn0Var, x52Var, ce31Var);
            case 3:
                asn asnVar = (asn) obj;
                zb2 zb2Var = (zb2) asnVar.a;
                if (z) {
                    if (!z) {
                        jah.e(z ? 1 : 0);
                        return null;
                    }
                    a1r0 a1r0Var = (a1r0) zb2Var.d.get();
                    c8o.l(a1r0Var);
                    return a1r0Var;
                }
                Activity activity = (Activity) zb2Var.a.get();
                c8o.l(activity);
                lzn0 lzn0Var2 = (lzn0) zb2Var.b.get();
                c8o.l(lzn0Var2);
                z710 z710Var = (z710) zb2Var.c.get();
                c8o.l(z710Var);
                return new rwj(activity, lzn0Var2, z710Var, (ewo) asnVar.b);
            case 4:
                asn asnVar2 = (asn) obj;
                if (z) {
                    if (z) {
                        return u1n0.z((q7r0) asnVar2.a);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                ewo ewoVar = (ewo) asnVar2.b;
                h7l0 h7l0Var = new h7l0((byte) 0);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-gen-alpha-kid-account-creation-ageverification";
                x6h1VarI.f = "3.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                p7h.M(new String[]{"kid-account-creation/age-verification", "kid-account-transition/age-verification"});
                r6h1 r6h1Var = r6h1.c;
                return new cn2(ewoVar, h7l0Var, new b7l0(new r6h1(kk0.l(y6h1VarA), (u8h1) null)));
            case 5:
                wj3 wj3Var = ((izo) obj).a;
                if (!z) {
                    return new ol4(false, false, false, false, false, (luk) ((kly0) wj3Var.b).get());
                }
                if (z) {
                    return new tx4((luk) ((kly0) wj3Var.b).get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 6:
                if (!z) {
                    return new rzo(this, (byte) 0);
                }
                if (z) {
                    return pzm.h((mos) ((zb6) ((asn) obj).a).h.get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 7:
                if (!z) {
                    return new uzo(this);
                }
                if (z) {
                    return u1n0.z((q7r0) ((wzn) obj).b);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 8:
                if (!z) {
                    return new zzo(this);
                }
                if (z) {
                    return u1n0.z((q7r0) ((wzn) obj).b);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 9:
                if (!z) {
                    return new a0p(this);
                }
                if (z) {
                    return new b0p(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 10:
                uw0 uw0Var = (uw0) ((asn) obj).a;
                if (!z) {
                    muz muzVar = (muz) uw0Var.i;
                    c8o.l(muzVar);
                    return muzVar;
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                tau0 tau0Var = (tau0) uw0Var.t;
                c8o.l(tau0Var);
                return tau0Var.a();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                w88 w88Var = ((d2p) obj).a;
                if (!z) {
                    return new u3f0((t2j0) w88Var.a.get(), (ajg) w88Var.b.get());
                }
                if (z) {
                    return new c0f1((e0f1) w88Var.d.get(), (zle1) w88Var.e.get(), new bb4(false, (luk) w88Var.i.get()), (q8n) w88Var.f.get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case grn1.d /* 12 */:
                ft9 ft9Var = (ft9) ((asn) obj).a;
                if (z) {
                    if (z) {
                        return pzm.h((mos) ft9Var.d.get());
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                dv00 dv00Var = (dv00) ft9Var.e.get();
                c8o.l(dv00Var);
                j3r j3rVar = rzq.y;
                return l2p1.f(dv00Var);
            case 13:
                asn asnVar3 = (asn) obj;
                l0a l0aVar = (l0a) asnVar3.a;
                if (z) {
                    if (z) {
                        return pzm.h((mos) l0aVar.b.get());
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                Context context2 = (Context) l0aVar.e.get();
                c8o.l(context2);
                yzh1 yzh1Var = (yzh1) l0aVar.d.get();
                c8o.l(yzh1Var);
                yo31 yo31Var = new yo31(yzh1Var, (byte) 28);
                los losVar2 = (los) ((jly0) asnVar3.b).get();
                kvs0 kvs0Var = (kvs0) l0aVar.c.get();
                c8o.l(kvs0Var);
                a0i1 a0i1Var = (a0i1) l0aVar.f.get();
                c8o.l(a0i1Var);
                return new j0a(context2, yo31Var, losVar2, kvs0Var, a0i1Var, (byte) 0);
            case 14:
                if (!z) {
                    return new s2p(this);
                }
                if (z) {
                    return new t2p(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 15:
                wzn wznVar3 = (wzn) obj;
                if (!z) {
                    RetrofitMaker retrofitMaker = (RetrofitMaker) ((n0q) wznVar3.a).b.Y3.get();
                    c8o.l(retrofitMaker);
                    return (i4b) retrofitMaker.createWebgateService(i4b.class, "android-blend-socialprompting-network");
                }
                if (z) {
                    return ((qop) wznVar3.b).f();
                }
                jah.e(z ? 1 : 0);
                return null;
            case 16:
                if (!z) {
                    return pzm.h((mos) ((pzb) ((x2p) obj).c).j.get());
                }
                if (z) {
                    return new e3p();
                }
                jah.e(z ? 1 : 0);
                return null;
            case 17:
                i7d i7dVar = ((f4p) obj).a;
                if (!z) {
                    return new e4p(this);
                }
                if (z) {
                    return new ecm1((uz5) ((kly0) i7dVar.i).get(), (fwn0) ((kly0) i7dVar.t).get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 18:
                if (!z) {
                    return new j4p(this, (byte) 0);
                }
                if (z) {
                    return new y5e();
                }
                jah.e(z ? 1 : 0);
                return null;
            case 19:
                if (!z) {
                    return new j4p(this, (byte) 1);
                }
                if (z) {
                    return new y5e();
                }
                jah.e(z ? 1 : 0);
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                if (!z) {
                    return new l4p(this);
                }
                if (z) {
                    return new m4p(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 21:
                fwe fweVar = (fwe) ((x2p) obj).c;
                if (!z) {
                    i8h1 i8h1Var = (i8h1) fweVar.c.get();
                    c8o.l(i8h1Var);
                    return i8h1Var;
                }
                if (z) {
                    return pzm.h((mos) fweVar.f.get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 22:
                zaf zafVar = (zaf) ((x2p) obj).c;
                if (!z) {
                    bfd bfdVar = (bfd) zafVar.g.get();
                    c8o.l(bfdVar);
                    return new g1e0(bfdVar);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                bfd bfdVar2 = (bfd) zafVar.g.get();
                c8o.l(bfdVar2);
                return new pte(bfdVar2);
            case 23:
                if (!z) {
                    bfd bfdVar3 = (bfd) ((omf) ((wzn) obj).a).b.get();
                    c8o.l(bfdVar3);
                    return bfdVar3;
                }
                if (z) {
                    return new i5p(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 24:
                if (!z) {
                    return new a6p(this);
                }
                if (z) {
                    return u1n0.z((q7r0) ((wzn) obj).b);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 25:
                if (!z) {
                    return new i6p(this);
                }
                if (z) {
                    return pzm.h((mos) ((cng) ((wzn) obj).b).e.get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 26:
                if (!z) {
                    return cwl1.C((q7r0) ((wzn) obj).a);
                }
                if (z) {
                    return new n6p(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 27:
                if (!z) {
                    return new g7p(this);
                }
                if (z) {
                    return new h7p(this, (byte) 0);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 28:
                t7p t7pVar = (t7p) obj;
                cvk cvkVar = (cvk) t7pVar.b;
                if (!z) {
                    RetrofitMaker retrofitMaker2 = (RetrofitMaker) cvkVar.h.get();
                    c8o.l(retrofitMaker2);
                    return (qfl) retrofitMaker2.createWebgateService(qfl.class, "android-bluejay-data-impl");
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                dl7 dl7Var = (dl7) cvkVar.s.get();
                c8o.l(dl7Var);
                return new cf01(dl7Var.a, cto1.q(((q7r0) t7pVar.c).d.c));
            default:
                d8p d8pVar = (d8p) obj;
                if (!z) {
                    tbl tblVar = d8pVar.a;
                    return new dxz0((q8n) tblVar.a.get(), (zwz0) tblVar.b.get());
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                Observable observableC = ((dxz0) d8pVar.b.get()).c();
                c8o.m(observableC);
                return observableC;
        }
    }
}
