package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kjq0 implements jjq0 {
    public final /* synthetic */ byte a = 0;
    public final lik1 b;
    public final boolean c;
    public final mfm d;
    public final Object e;

    public kjq0(lik1 lik1Var, boolean z, mfm mfmVar, q2w0 q2w0Var) {
        this.b = lik1Var;
        this.c = z;
        this.d = mfmVar;
        this.e = q2w0Var;
    }

    public final Object invoke(Object obj) {
        emu0 emu0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        boolean z = this.c;
        switch (b) {
            case 0:
                ssi0 ssi0Var = (ssi0) obj;
                vbx0 vbx0Var = vbx0.N0;
                String str = ssi0Var.f;
                boolean z2 = str != null;
                xj61 xj61Var = new xj61();
                s9x0 s9x0Var = s9x0.N0;
                xj61Var.add(s9x0Var);
                wbx0 wbx0Var = wbx0.N0;
                xj61Var.add(wbx0Var);
                u9x0 u9x0Var = u9x0.Z;
                xj61Var.add(u9x0Var);
                if (z2) {
                    xj61Var.add(vbx0Var);
                }
                xj61 xj61VarJ = cwl1.j(xj61Var);
                if (z || !xj61VarJ.a.isEmpty()) {
                    hmu0 hmu0Var = (hmu0) obj2;
                    String str2 = this.b.a;
                    String str3 = ssi0Var.f;
                    String str4 = ssi0Var.b;
                    boolean zContainsKey = xj61VarJ.a.containsKey(s9x0Var);
                    xkg0 xkg0Var = xj61VarJ.a;
                    String str5 = ssi0Var.d;
                    boolean zContainsKey2 = xkg0Var.containsKey(u9x0Var);
                    if (!xkg0Var.containsKey(vbx0Var)) {
                        emu0Var = c710.Z0;
                    } else {
                        if (str == null) {
                            hhg1.n("Failed requirement.");
                            return null;
                        }
                        emu0Var = new emu0(str);
                    }
                    Observable map = hmu0Var.g.g1(str4, str5).map(new sjq0(hmu0Var, new dmu0(str2, zContainsKey2, xkg0Var.containsKey(wbx0Var), this.c, str3, str4, str5, zContainsKey, emu0Var, ssi0Var.g), (byte) 28));
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    mfm.b(this.d, map, yon1.d1(), new bjm(6, ssi0Var.b, (String) null), ssi0Var.e, 16);
                }
                return rih1Var;
            case 1:
                ssi0 ssi0Var2 = (ssi0) obj;
                String str6 = ssi0Var2.b;
                boolean z3 = ssi0Var2.c;
                if (z3 || z) {
                    nfc0 nfc0Var = (nfc0) obj2;
                    String str7 = ssi0Var2.d;
                    Observable observableCombineLatest = Observable.combineLatest(nfc0Var.j.g1(str6, str7), nfc0Var.c.a(str6), yoi1.i(nfc0Var.f.b(), o6x.a), new ur00(nfc0Var, this.b, str6, str7, new ofc0(z3), (byte) 19));
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    mfm.b(this.d, observableCombineLatest, yon1.d1(), new bjm(6, str6, (String) null), ssi0Var2.e, 16);
                }
                return rih1Var;
            default:
                ssi0 ssi0Var3 = (ssi0) obj;
                if (z) {
                    q2w0 q2w0Var = (q2w0) obj2;
                    String str8 = ssi0Var3.b;
                    String str9 = ssi0Var3.d;
                    Observable map2 = q2w0Var.b.g1(str8, str9).map(new tzr0((byte) 21, q2w0Var, this.b, str9, str8));
                    AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                    mfm.b(this.d, map2, yon1.d1(), (bjm) null, ssi0Var3.e, 20);
                }
                return rih1Var;
        }
    }

    public kjq0(lik1 lik1Var, boolean z, nfc0 nfc0Var, mfm mfmVar) {
        this.b = lik1Var;
        this.c = z;
        this.e = nfc0Var;
        this.d = mfmVar;
    }

    public kjq0(lik1 lik1Var, boolean z, mfm mfmVar, fza fzaVar, hmu0 hmu0Var) {
        this.b = lik1Var;
        this.c = z;
        this.d = mfmVar;
        this.e = hmu0Var;
    }
}
