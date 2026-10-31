package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonEncodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class cha0 implements jga0, uax, z1k {
    public final ArrayList a;
    public final nfa0 b;
    public final iu30 c;
    public final vfa0 d;
    public String e;
    public String f;
    public final /* synthetic */ byte g;
    public Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cha0(nfa0 nfa0Var, iu30 iu30Var, byte b) {
        this(nfa0Var, iu30Var, 0);
        this.g = b;
        switch (b) {
            case 1:
                this(nfa0Var, iu30Var, 0);
                this.h = new LinkedHashMap();
                break;
            case 2:
                this(nfa0Var, iu30Var, 0);
                this.h = new ArrayList();
                break;
            default:
                this.a.add("primitive");
                break;
        }
    }

    public final void E(h661 h661Var, int i, boolean z) {
        t(p(h661Var, i), fga0.a(Boolean.valueOf(z)));
    }

    public final void G(h661 h661Var, int i, String str) {
        t(p(h661Var, i), fga0.c(str));
    }

    public final void I(inw0 inw0Var, int i, byte b) {
        t(p(inw0Var, i), fga0.b(Byte.valueOf(b)));
    }

    public final void J() {
        String str = (String) o7h.C0(this.a);
        if (str == null) {
            this.c.invoke(rga0.INSTANCE);
        } else {
            t(str, rga0.INSTANCE);
        }
    }

    public final uax L(inw0 inw0Var, int i) {
        String strP = p(inw0Var, i);
        h661 h661VarG = inw0Var.g(i);
        if (xfc1.b(h661VarG)) {
            return new a7(this, strP);
        }
        if (xfc1.a(h661VarG)) {
            return new a7(this, strP, h661VarG);
        }
        this.a.add(strP);
        return this;
    }

    public final void O(short s) {
        t((String) q(), fga0.b(Short.valueOf(s)));
    }

    public final void P(boolean z) {
        t((String) q(), fga0.a(Boolean.valueOf(z)));
    }

    public final void R(uga0 uga0Var) {
        i(hga0.a, uga0Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void S(float f) throws SerializationException {
        n(f, q());
    }

    public final void U(char c) {
        t((String) q(), fga0.c(String.valueOf(c)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void Z(h661 h661Var, int i, float f) throws SerializationException {
        n(f, p(h661Var, i));
    }

    public final void a(h661 h661Var) {
        if (!this.a.isEmpty()) {
            q();
        }
        this.c.invoke(o());
    }

    public final void a0(int i) {
        t((String) q(), fga0.b(Integer.valueOf(i)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final z1k b(h661 h661Var) throws SerializationException {
        cha0 cha0Var;
        cha0 cha0Var2;
        iu30 j6Var = o7h.C0(this.a) == null ? this.c : new j6(this, (byte) 1);
        yoi1 kind = h661Var.getKind();
        boolean zJ = u890.j(kind, uic1.i);
        nfa0 nfa0Var = this.b;
        if (zJ || (kind instanceof scv0)) {
            cha0Var = new cha0(nfa0Var, j6Var, (byte) 2);
        } else {
            if (u890.j(kind, vic1.h)) {
                h661 h661VarL = anm1.l(nfa0Var.b, h661Var.g(0));
                yoi1 kind2 = h661VarL.getKind();
                if ((kind2 instanceof mnw0) || u890.j(kind2, l661.h)) {
                    jha0 jha0Var = new jha0(nfa0Var, j6Var, (byte) 1);
                    jha0Var.t = true;
                    cha0Var2 = jha0Var;
                } else {
                    if (!nfa0Var.a.d) {
                        throw vvm1.h(h661VarL);
                    }
                    cha0Var = new cha0(nfa0Var, j6Var, (byte) 2);
                }
            } else {
                cha0Var2 = new cha0(nfa0Var, j6Var, (byte) 1);
            }
            cha0Var = cha0Var2;
        }
        String str = this.e;
        if (str != null) {
            if (cha0Var instanceof jha0) {
                jha0 jha0Var2 = (jha0) cha0Var;
                jha0Var2.t("key", fga0.c(str));
                String strH = this.f;
                if (strH == null) {
                    strH = h661Var.h();
                }
                jha0Var2.t("value", fga0.c(strH));
            } else {
                String strH2 = this.f;
                if (strH2 == null) {
                    strH2 = h661Var.h();
                }
                cha0Var.t(str, fga0.c(strH2));
            }
            this.e = null;
            this.f = null;
        }
        return cha0Var;
    }

    public final kl1 c() {
        return this.b.b;
    }

    public final nfa0 d() {
        return this.b;
    }

    public final boolean d0() {
        return this.d.a;
    }

    public final void e(int i, int i2, h661 h661Var) {
        t(p(h661Var, i), fga0.b(Integer.valueOf(i2)));
    }

    public final void f(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        this.a.add(p(h661Var, i));
        W(nma0Var, obj);
    }

    public final void f0(inw0 inw0Var, int i, char c) {
        t(p(inw0Var, i), fga0.c(String.valueOf(c)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void g(h661 h661Var, int i, double d) throws SerializationException {
        m(p(h661Var, i), d);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void h(double d) throws SerializationException {
        m(q(), d);
    }

    public final void h0(String str) {
        t((String) q(), fga0.c(str));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    public final void i(nma0 nma0Var, Object obj) {
        String strV;
        nma0 nma0VarO;
        Object objC0 = o7h.C0(this.a);
        nfa0 nfa0Var = this.b;
        if (objC0 == null) {
            h661 h661VarL = anm1.l(nfa0Var.b, nma0Var.getDescriptor());
            if ((h661VarL.getKind() instanceof mnw0) || h661VarL.getKind() == l661.h) {
                new cha0(nfa0Var, this.c, (byte) 0).i(nma0Var, obj);
                return;
            }
        }
        boolean z = nma0Var instanceof f9;
        int i = nfa0Var.a.l;
        if (!z) {
            int iC = l1d.C(i);
            if (iC != 0) {
                if (iC == 1) {
                    yoi1 kind = nma0Var.getDescriptor().getKind();
                    strV = (u890.j(kind, uic1.h) || u890.j(kind, uic1.j)) ? i9p1.v(nfa0Var, nma0Var.getDescriptor()) : null;
                } else if (iC != 2) {
                    eg.o();
                    return;
                }
            }
        } else if (i != 1) {
        }
        if (z) {
            f9 f9Var = (f9) nma0Var;
            if (obj == null) {
                bhn0.k("Value for serializer ", f9Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            nma0VarO = n9p1.o(f9Var, this, obj);
        } else {
            nma0VarO = nma0Var;
        }
        if (strV != null) {
            i9p1.t(nfa0Var, nma0Var, nma0VarO, strV);
            i9p1.u(nma0VarO.getDescriptor().getKind());
            String strH = nma0VarO.getDescriptor().h();
            this.e = strV;
            this.f = strH;
        }
        nma0VarO.serialize(this, obj);
    }

    public final void j(byte b) {
        t((String) q(), fga0.b(Byte.valueOf(b)));
    }

    public final void k(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        this.a.add(p(h661Var, i));
        i(nma0Var, obj);
    }

    public final void l(h661 h661Var, int i, long j) {
        t(p(h661Var, i), fga0.b(Long.valueOf(j)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void m(Object obj, double d) throws SerializationException {
        String str = (String) obj;
        t(str, fga0.b(Double.valueOf(d)));
        if (!this.d.j && Math.abs(d) > Double.MAX_VALUE) {
            throw new JsonEncodingException(2, vvm1.E(str, Double.valueOf(d)), null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void n(float f, Object obj) throws SerializationException {
        String str = (String) obj;
        t(str, fga0.b(Float.valueOf(f)));
        if (!this.d.j && Math.abs(f) > Float.MAX_VALUE) {
            throw new JsonEncodingException(2, vvm1.E(str, Float.valueOf(f)), null);
        }
    }

    public ega0 o() {
        switch (this.g) {
            case 0:
                ega0 ega0Var = (ega0) this.h;
                if (ega0Var != null) {
                    return ega0Var;
                }
                hhg1.n("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new uga0((LinkedHashMap) this.h);
            default:
                return new pfa0((ArrayList) this.h);
        }
    }

    public final String p(h661 h661Var, int i) {
        String strValueOf;
        switch (this.g) {
            case 2:
                strValueOf = String.valueOf(i);
                break;
            default:
                strValueOf = mue1.D(h661Var, this.b, i);
                break;
        }
        return strValueOf;
    }

    public final Object q() {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            return arrayList.remove(p7h.L(arrayList));
        }
        uh61.j("No tag in stack for requested element");
        return null;
    }

    public final void r(h661 h661Var, int i) {
        t((String) q(), fga0.c(h661Var.e(i)));
    }

    public void s(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        switch (this.g) {
            case 1:
                if (obj != null || this.d.f) {
                    f(h661Var, i, nma0Var, obj);
                }
                break;
            default:
                f(h661Var, i, nma0Var, obj);
                break;
        }
    }

    public void t(String str, ega0 ega0Var) {
        switch (this.g) {
            case 0:
                if (str != "primitive") {
                    hhg1.n("This output can only consume primitives with 'primitive' tag");
                } else if (((ega0) this.h) != null) {
                    hhg1.n("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                } else {
                    this.h = ega0Var;
                    this.c.invoke(ega0Var);
                }
                break;
            case 1:
                ((LinkedHashMap) this.h).put(str, ega0Var);
                break;
            default:
                ((ArrayList) this.h).add(Integer.parseInt(str), ega0Var);
                break;
        }
    }

    public final uax v(h661 h661Var) {
        ArrayList arrayList = this.a;
        if (o7h.C0(arrayList) == null) {
            return new cha0(this.b, this.c, (byte) 0).v(h661Var);
        }
        if (this.e != null) {
            this.f = h661Var.h();
        }
        String str = (String) q();
        if (xfc1.b(h661Var)) {
            return new a7(this, str);
        }
        if (xfc1.a(h661Var)) {
            return new a7(this, str, h661Var);
        }
        arrayList.add(str);
        return this;
    }

    public final void y(inw0 inw0Var, int i, short s) {
        t(p(inw0Var, i), fga0.b(Short.valueOf(s)));
    }

    public final void z(long j) {
        t((String) q(), fga0.b(Long.valueOf(j)));
    }

    public cha0(nfa0 nfa0Var, iu30 iu30Var, int i) {
        this.a = new ArrayList();
        this.b = nfa0Var;
        this.c = iu30Var;
        this.d = nfa0Var.a;
    }
}
