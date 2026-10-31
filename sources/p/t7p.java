package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t7p {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public t7p(qsy qsyVar) {
        this.b = qsyVar;
        this.a = iy81.a(new lbp(this, 1, (byte) 19));
        this.c = iy81.a(new lbp(this, 2, (byte) 19));
        this.d = iy81.a(new lbp(this, 0, (byte) 19));
    }

    public z2h a() {
        cvk cvkVar = (cvk) this.b;
        uu00 uu00Var = (uu00) cvkVar.j.get();
        c8o.l(uu00Var);
        xrc0 xrc0Var = (xrc0) cvkVar.k.get();
        c8o.l(xrc0Var);
        return new z2h(uu00Var, xrc0Var);
    }

    public ham b() {
        Set setSingleton;
        ArrayList arrayList = new ArrayList(2);
        fvo fvoVar = (fvo) this.b;
        rz6 rz6Var = (rz6) fvoVar.d.get();
        c8o.l(rz6Var);
        arrayList.add(rz6Var);
        k9a1 k9a1Var = (k9a1) fvoVar.f.get();
        c8o.l(k9a1Var);
        arrayList.add(k9a1Var);
        if (arrayList.isEmpty()) {
            setSingleton = Collections.EMPTY_SET;
        } else {
            setSingleton = arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
        }
        LinkedHashMap linkedHashMapC0 = d0p1.c0(2);
        linkedHashMapC0.put(mz6.class, (d7p) this.c);
        linkedHashMapC0.put(u8a1.class, (d7p) this.d);
        return new ham(setSingleton, ern1.y(linkedHashMapC0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMapC0)), (byte) 18);
    }

    public mcn1 c() {
        String strD = ((qop) this.b).d();
        wqg wqgVar = (wqg) ((ozp) this.c).a.h8.get();
        c8o.l(wqgVar);
        return new mcn1(strD, wqgVar);
    }

    public t7p(nzp nzpVar, qop qopVar, jbt jbtVar) {
        this.b = nzpVar;
        this.a = qopVar;
        this.c = jbtVar;
        this.d = new j7p(this, (byte) 23);
    }

    public t7p(b0q b0qVar, qop qopVar, lbt lbtVar) {
        this.b = lbtVar;
        this.c = qopVar;
        this.d = b0qVar;
        this.a = iy81.a(new ikp(this, (byte) 18));
    }

    public t7p(nzp nzpVar, qop qopVar, zbt zbtVar) {
        this.b = nzpVar;
        this.a = zbtVar;
        this.c = qopVar;
        this.d = new j7p(this, (byte) 7);
    }

    public t7p(p0q p0qVar, qop qopVar, lbt lbtVar) {
        this.b = qopVar;
        this.c = lbtVar;
        this.d = p0qVar;
        this.a = iy81.a(new j7p(this, (byte) 21));
    }

    public t7p(xzp xzpVar, qop qopVar, jbt jbtVar) {
        this.b = jbtVar;
        this.c = qopVar;
        this.d = xzpVar;
        this.a = iy81.a(new ikp(this, (byte) 17));
    }

    public t7p(ozp ozpVar, qop qopVar, jbt jbtVar) {
        this.b = jbtVar;
        this.a = qopVar;
        this.c = ozpVar;
        this.d = new j7p(this, (byte) 22);
    }

    public t7p(htk htkVar) {
        this.b = htkVar;
        this.a = iy81.a(new d7p(this, 0, (byte) 4));
        this.c = new d7p(this, 1, (byte) 4);
        this.d = new d7p(this, 2, (byte) 4);
    }

    public t7p(kzp kzpVar, qop qopVar, lbt lbtVar) {
        this.b = qopVar;
        this.c = kzpVar;
        byte b = 16;
        this.d = new i8p(this, 1, b);
        this.a = iy81.a(new i8p(this, 0, b));
    }

    public t7p(ozp ozpVar, qop qopVar, fl90 fl90Var) {
        this.b = qopVar;
        this.c = ozpVar;
        byte b = 19;
        this.d = new i8p(this, 1, b);
        this.a = iy81.a(new i8p(this, 0, b));
    }

    public t7p(b7o b7oVar, c7o c7oVar) {
        this.b = c7oVar;
        this.c = b7oVar;
        byte b = 9;
        this.a = xqu.b(new i8p(this, 0, b));
        this.d = xqu.b(new i8p(this, 1, b));
    }

    public t7p(p2v p2vVar, q2v q2vVar) {
        this.b = p2vVar;
        this.a = xqu.b(new lbp(this, 1, (byte) 2));
        this.c = new lbp(this, 0, (byte) 2);
        this.d = new lbp(this, 2, (byte) 2);
    }

    public t7p(pag1 pag1Var, icb0 icb0Var, q7r0 q7r0Var) {
        this.b = pag1Var;
        this.c = q7r0Var;
        byte b = 4;
        this.a = xqu.b(new dlp(this, 0, b));
        this.d = xqu.b(new dlp(this, 1, b));
    }

    public t7p(b0q b0qVar, qop qopVar) {
        this.b = b0qVar;
        this.a = iy81.a(new lbp(this, 0, (byte) 13));
        this.c = iy81.a(new lbp(this, 1, (byte) 13));
        this.d = iy81.a(new lbp(this, 2, (byte) 13));
    }

    public t7p(cx20 cx20Var, dx20 dx20Var) {
        this.b = cx20Var;
        byte b = 6;
        this.a = xqu.b(new chp(this, 1, b));
        this.c = new chp(this, 0, b);
        this.d = new chp(this, 2, b);
    }

    public t7p(b1q b1qVar, qop qopVar, bct bctVar) {
        this.b = b1qVar;
        this.c = qopVar;
        byte b = 7;
        this.a = xqu.b(new dlp(this, 1, b));
        this.d = xqu.b(new dlp(this, 0, b));
    }

    public t7p(q2q q2qVar, qop qopVar) {
        this.b = q2qVar;
        this.a = iy81.a(new lbp(this, 0, (byte) 12));
        this.c = iy81.a(new lbp(this, 1, (byte) 12));
        this.d = iy81.a(new lbp(this, 2, (byte) 12));
    }

    public t7p(j1b0 j1b0Var, k1b0 k1b0Var) {
        this.b = j1b0Var;
        this.c = k1b0Var;
        byte b = 2;
        this.a = iy81.a(new dlp(this, 0, b));
        this.d = new dlp(this, 1, b);
    }

    public t7p(ik10 ik10Var, ryj ryjVar, jk10 jk10Var) {
        this.b = ryjVar;
        this.c = ik10Var;
        byte b = 21;
        this.d = new i8p(this, 0, b);
        this.a = xqu.b(new i8p(this, 1, b));
    }

    public t7p(dpf0 dpf0Var, ryj ryjVar, epf0 epf0Var) {
        this.b = dpf0Var;
        this.c = epf0Var;
        byte b = 16;
        this.a = iy81.a(new dlp(this, 1, b));
        this.d = xqu.b(new dlp(this, 0, b));
    }

    public t7p(t7w t7wVar, ryj ryjVar, v7w v7wVar, q7r0 q7r0Var) {
        this.b = t7wVar;
        this.c = q7r0Var;
        byte b = 14;
        this.a = xqu.b(new i8p(this, 0, b));
        this.d = new i8p(this, 1, b);
    }

    public t7p(q9d0 q9d0Var, r9d0 r9d0Var, q7r0 q7r0Var) {
        this.b = q9d0Var;
        this.c = q7r0Var;
        byte b = 10;
        this.a = xqu.b(new dlp(this, 0, b));
        this.d = iy81.a(new dlp(this, 1, b));
    }

    public t7p(gtm gtmVar, ryj ryjVar, htm htmVar, q7r0 q7r0Var) {
        this.b = gtmVar;
        this.c = q7r0Var;
        byte b = 2;
        this.a = xqu.b(new i8p(this, 0, b));
        this.d = xqu.b(new i8p(this, 1, b));
    }

    public t7p(xtm xtmVar, ryj ryjVar, ytm ytmVar, q7r0 q7r0Var) {
        this.b = xtmVar;
        this.c = q7r0Var;
        byte b = 3;
        this.a = xqu.b(new i8p(this, 0, b));
        this.d = xqu.b(new i8p(this, 1, b));
    }

    public t7p(fvo fvoVar, hvo hvoVar, q7r0 q7r0Var) {
        this.b = fvoVar;
        this.c = new d7p(this, 0, (byte) 24);
        this.d = new d7p(this, 1, (byte) 24);
        this.a = iy81.a(new d7p(this, 2, (byte) 24));
    }

    public t7p(cvk cvkVar, pxk pxkVar, q7r0 q7r0Var) {
        this.b = cvkVar;
        this.c = q7r0Var;
        this.a = iy81.a(new ewo(this, 0, (byte) 28));
        this.d = xqu.b(new ewo(this, 1, (byte) 28));
    }

    public t7p(a0f0 a0f0Var, c0f0 c0f0Var, q7r0 q7r0Var) {
        this.b = a0f0Var;
        this.c = q7r0Var;
        byte b = 15;
        this.a = iy81.a(new dlp(this, 0, b));
        this.d = new dlp(this, 1, b);
    }

    public t7p(o3m o3mVar, q7r0 q7r0Var) {
        this.b = o3mVar;
        this.a = iy81.a(new d7p(this, 1, (byte) 8));
        this.c = iy81.a(new d7p(this, 2, (byte) 8));
        this.d = iy81.a(new d7p(this, 0, (byte) 8));
    }

    public t7p(zuj zujVar, d5y d5yVar, q7r0 q7r0Var) {
        this.b = d5yVar;
        this.c = q7r0Var;
        byte b = 15;
        this.a = xqu.b(new i8p(this, 0, b));
        this.d = new i8p(this, 1, b);
    }

    public t7p(jtu jtuVar, lyj lyjVar, q7r0 q7r0Var) {
        this.b = jtuVar;
        this.a = xqu.b(new lbp(this, 0, (byte) 0));
        this.c = iy81.a(new lbp(this, 1, (byte) 0));
        this.d = xqu.b(new lbp(this, 2, (byte) 0));
    }
}
