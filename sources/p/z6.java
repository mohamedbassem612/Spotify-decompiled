package p;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class z6 implements bga0, dar, x1k {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final nfa0 c;
    public final String d;
    public final vfa0 e;

    public z6(String str, nfa0 nfa0Var) {
        this.c = nfa0Var;
        this.d = str;
        this.e = nfa0Var.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final Object A(h661 h661Var, int i, nma0 nma0Var, Object obj) throws SerializationException {
        this.a.add(E(h661Var, i));
        Object objY = Y(nma0Var);
        if (!this.b) {
            I();
        }
        this.b = false;
        return objY;
    }

    public final Object B(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        this.a.add(E(h661Var, i));
        Object objY = (nma0Var.getDescriptor().b() || X()) ? Y(nma0Var) : null;
        if (!this.b) {
            I();
        }
        this.b = false;
        return objY;
    }

    public final short C() {
        return x(I());
    }

    public final double D(h661 h661Var, int i) {
        return k(E(h661Var, i));
    }

    public final String E(h661 h661Var, int i) {
        String strZ = z(h661Var, i);
        return strZ;
    }

    public final float F() {
        return l(I());
    }

    public abstract ega0 G();

    public final double H() {
        return k(I());
    }

    public final Object I() {
        ArrayList arrayList = this.a;
        Object objRemove = arrayList.remove(p7h.L(arrayList));
        this.b = true;
        return objRemove;
    }

    public final String J() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : o7h.y0(arrayList, ".", "$.", (String) null, (iu30) null, 60);
    }

    public final boolean K() {
        return h(I());
    }

    public final String L(String str) {
        return J() + '.' + str;
    }

    public final boolean M(h661 h661Var, int i) {
        return h(E(h661Var, i));
    }

    public final char N() {
        return j(I());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void O(aha0 aha0Var, String str, String str2) throws SerializationException {
        throw new JsonDecodingException(vvm1.w(-1, "Failed to parse literal '" + aha0Var + "' as " + (nhc1.Y(str, "i", false) ? "an " : "a ").concat(str) + " value", L(str2), (String) null, this.c.a.m ? vvm1.C(-1, g().toString()).toString() : null));
    }

    public final float Q(h661 h661Var, int i) {
        return l(E(h661Var, i));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final int T(h661 h661Var) throws SerializationException {
        String str = (String) I();
        ega0 ega0VarE = e(str);
        String strH = h661Var.h();
        boolean z = ega0VarE instanceof aha0;
        nfa0 nfa0Var = this.c;
        if (z) {
            return mue1.F(h661Var, nfa0Var, ((aha0) ega0VarE).b(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        jd11 jd11Var = rc11.a;
        sb.append(jd11Var.b(aha0.class).r());
        sb.append(", but had ");
        sb.append(jd11Var.b(ega0VarE.getClass()).r());
        throw new JsonDecodingException(vvm1.w(-1, l1d.n(" as the serialized body of ", strH, sb), L(str), (String) null, nfa0Var.a.m ? vvm1.C(-1, ega0VarE.toString()).toString() : null));
    }

    public final String V() {
        return y(I());
    }

    public boolean X() {
        return !(g() instanceof rga0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final Object Y(nma0 nma0Var) throws SerializationException {
        if (!(nma0Var instanceof f9)) {
            return nma0Var.deserialize(this);
        }
        nfa0 nfa0Var = this.c;
        vfa0 vfa0Var = nfa0Var.a;
        f9 f9Var = (f9) nma0Var;
        String strV = i9p1.v(nfa0Var, f9Var.getDescriptor());
        uga0 uga0VarG = g();
        String strH = f9Var.getDescriptor().h();
        if (!(uga0VarG instanceof uga0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jd11 jd11Var = rc11.a;
            sb.append(jd11Var.b(uga0.class).r());
            sb.append(", but had ");
            sb.append(jd11Var.b(uga0VarG.getClass()).r());
            throw new JsonDecodingException(vvm1.w(-1, l1d.n(" as the serialized body of ", strH, sb), J(), (String) null, nfa0Var.a.m ? vvm1.C(-1, uga0VarG.toString()).toString() : null));
        }
        uga0 uga0Var = uga0VarG;
        ega0 ega0Var = (ega0) uga0Var.get(strV);
        try {
            return hon1.A(nfa0Var, strV, uga0Var, n9p1.n((f9) nma0Var, this, ega0Var != null ? fga0.g(fga0.m(ega0Var)) : null));
        } catch (SerializationException e) {
            String message = e.getMessage();
            message.getClass();
            throw new JsonDecodingException(vvm1.w(-1, message, (String) null, (String) null, nfa0Var.a.m ? vvm1.C(-1, uga0Var.toString()).toString() : null));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public x1k b(h661 h661Var) throws SerializationException {
        pfa0 pfa0VarG = g();
        yoi1 kind = h661Var.getKind();
        boolean zJ = u890.j(kind, uic1.i);
        nfa0 nfa0Var = this.c;
        if (zJ || (kind instanceof scv0)) {
            String strH = h661Var.h();
            if (pfa0VarG instanceof pfa0) {
                return new hha0(nfa0Var, pfa0VarG);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            jd11 jd11Var = rc11.a;
            sb.append(jd11Var.b(pfa0.class).r());
            sb.append(", but had ");
            sb.append(jd11Var.b(pfa0VarG.getClass()).r());
            throw new JsonDecodingException(vvm1.w(-1, l1d.n(" as the serialized body of ", strH, sb), J(), (String) null, nfa0Var.a.m ? vvm1.C(-1, pfa0VarG.toString()).toString() : null));
        }
        if (!u890.j(kind, vic1.h)) {
            String strH2 = h661Var.h();
            if (pfa0VarG instanceof uga0) {
                return new gha0(nfa0Var, (uga0) pfa0VarG, this.d, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            jd11 jd11Var2 = rc11.a;
            sb2.append(jd11Var2.b(uga0.class).r());
            sb2.append(", but had ");
            sb2.append(jd11Var2.b(pfa0VarG.getClass()).r());
            throw new JsonDecodingException(vvm1.w(-1, l1d.n(" as the serialized body of ", strH2, sb2), J(), (String) null, nfa0Var.a.m ? vvm1.C(-1, pfa0VarG.toString()).toString() : null));
        }
        h661 h661VarL = anm1.l(nfa0Var.b, h661Var.g(0));
        yoi1 kind2 = h661VarL.getKind();
        if ((kind2 instanceof mnw0) || u890.j(kind2, l661.h)) {
            String strH3 = h661Var.h();
            if (pfa0VarG instanceof uga0) {
                return new iha0(nfa0Var, (uga0) pfa0VarG);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            jd11 jd11Var3 = rc11.a;
            sb3.append(jd11Var3.b(uga0.class).r());
            sb3.append(", but had ");
            sb3.append(jd11Var3.b(pfa0VarG.getClass()).r());
            throw new JsonDecodingException(vvm1.w(-1, l1d.n(" as the serialized body of ", strH3, sb3), J(), (String) null, nfa0Var.a.m ? vvm1.C(-1, pfa0VarG.toString()).toString() : null));
        }
        if (!nfa0Var.a.d) {
            throw vvm1.h(h661VarL);
        }
        String strH4 = h661Var.h();
        if (pfa0VarG instanceof pfa0) {
            return new hha0(nfa0Var, pfa0VarG);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        jd11 jd11Var4 = rc11.a;
        sb4.append(jd11Var4.b(pfa0.class).r());
        sb4.append(", but had ");
        sb4.append(jd11Var4.b(pfa0VarG.getClass()).r());
        throw new JsonDecodingException(vvm1.w(-1, l1d.n(" as the serialized body of ", strH4, sb4), J(), (String) null, nfa0Var.a.m ? vvm1.C(-1, pfa0VarG.toString()).toString() : null));
    }

    public final short b0(inw0 inw0Var, int i) {
        return x(E(inw0Var, i));
    }

    public final kl1 c() {
        return this.c.b;
    }

    public final byte c0() {
        return i(I());
    }

    public final nfa0 d() {
        return this.c;
    }

    public abstract ega0 e(String str);

    public final char e0(inw0 inw0Var, int i) {
        return j(E(inw0Var, i));
    }

    public final String f(h661 h661Var, int i) {
        return y(E(h661Var, i));
    }

    public final ega0 g() {
        ega0 ega0VarE;
        String str = (String) o7h.C0(this.a);
        return (str == null || (ega0VarE = e(str)) == null) ? G() : ega0VarE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final boolean h(Object obj) throws SerializationException {
        String str = (String) obj;
        ega0 ega0VarE = e(str);
        if (!(ega0VarE instanceof aha0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jd11 jd11Var = rc11.a;
            sb.append(jd11Var.b(aha0.class).r());
            sb.append(", but had ");
            sb.append(jd11Var.b(ega0VarE.getClass()).r());
            sb.append(" as the serialized body of boolean");
            throw new JsonDecodingException(vvm1.w(-1, sb.toString(), L(str), (String) null, this.c.a.m ? vvm1.C(-1, ega0VarE.toString()).toString() : null));
        }
        aha0 aha0Var = (aha0) ega0VarE;
        try {
            Boolean boolF = fga0.f(aha0Var);
            if (boolF != null) {
                return boolF.booleanValue();
            }
            O(aha0Var, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            O(aha0Var, "boolean", str);
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final byte i(Object obj) throws SerializationException {
        String str = (String) obj;
        ega0 ega0VarE = e(str);
        if (!(ega0VarE instanceof aha0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jd11 jd11Var = rc11.a;
            sb.append(jd11Var.b(aha0.class).r());
            sb.append(", but had ");
            sb.append(jd11Var.b(ega0VarE.getClass()).r());
            sb.append(" as the serialized body of byte");
            throw new JsonDecodingException(vvm1.w(-1, sb.toString(), L(str), (String) null, this.c.a.m ? vvm1.C(-1, ega0VarE.toString()).toString() : null));
        }
        aha0 aha0Var = (aha0) ega0VarE;
        try {
            long jO = fga0.o(aha0Var);
            Byte bValueOf = (-128 > jO || jO > 127) ? null : Byte.valueOf((byte) jO);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            O(aha0Var, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            O(aha0Var, "byte", str);
            throw null;
        }
    }

    public final long i0(h661 h661Var, int i) {
        return v(E(h661Var, i));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final char j(Object obj) throws SerializationException {
        String str = (String) obj;
        ega0 ega0VarE = e(str);
        if (!(ega0VarE instanceof aha0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jd11 jd11Var = rc11.a;
            sb.append(jd11Var.b(aha0.class).r());
            sb.append(", but had ");
            sb.append(jd11Var.b(ega0VarE.getClass()).r());
            sb.append(" as the serialized body of char");
            throw new JsonDecodingException(vvm1.w(-1, sb.toString(), L(str), (String) null, this.c.a.m ? vvm1.C(-1, ega0VarE.toString()).toString() : null));
        }
        aha0 aha0Var = (aha0) ega0VarE;
        try {
            String strB = aha0Var.b();
            int length = strB.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strB.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            O(aha0Var, "char", str);
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final double k(Object obj) throws SerializationException {
        String str = (String) obj;
        ega0 ega0VarE = e(str);
        boolean z = ega0VarE instanceof aha0;
        nfa0 nfa0Var = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            jd11 jd11Var = rc11.a;
            sb.append(jd11Var.b(aha0.class).r());
            sb.append(", but had ");
            sb.append(jd11Var.b(ega0VarE.getClass()).r());
            sb.append(" as the serialized body of double");
            throw new JsonDecodingException(vvm1.w(-1, sb.toString(), L(str), (String) null, nfa0Var.a.m ? vvm1.C(-1, ega0VarE.toString()).toString() : null));
        }
        aha0 aha0Var = (aha0) ega0VarE;
        try {
            double dH = fga0.h(aha0Var);
            if (nfa0Var.a.j || Math.abs(dH) <= Double.MAX_VALUE) {
                return dH;
            }
            throw new JsonDecodingException(vvm1.w(-1, vvm1.E(str, Double.valueOf(dH)), (String) null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", nfa0Var.a.m ? vvm1.C(-1, g().toString()).toString() : null));
        } catch (IllegalArgumentException unused) {
            O(aha0Var, "double", str);
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final float l(Object obj) throws SerializationException {
        String str = (String) obj;
        ega0 ega0VarE = e(str);
        boolean z = ega0VarE instanceof aha0;
        nfa0 nfa0Var = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            jd11 jd11Var = rc11.a;
            sb.append(jd11Var.b(aha0.class).r());
            sb.append(", but had ");
            sb.append(jd11Var.b(ega0VarE.getClass()).r());
            sb.append(" as the serialized body of float");
            throw new JsonDecodingException(vvm1.w(-1, sb.toString(), L(str), (String) null, nfa0Var.a.m ? vvm1.C(-1, ega0VarE.toString()).toString() : null));
        }
        aha0 aha0Var = (aha0) ega0VarE;
        try {
            mf80 mf80Var = fga0.a;
            float f = Float.parseFloat(aha0Var.b());
            if (nfa0Var.a.j || Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            throw new JsonDecodingException(vvm1.w(-1, vvm1.E(str, Float.valueOf(f)), (String) null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", nfa0Var.a.m ? vvm1.C(-1, g().toString()).toString() : null));
        } catch (IllegalArgumentException unused) {
            O(aha0Var, "float", str);
            throw null;
        }
    }

    public final ega0 m() {
        return g();
    }

    public final int n() {
        return s(I());
    }

    public final int o(h661 h661Var, int i) {
        return s(E(h661Var, i));
    }

    public final byte q(inw0 inw0Var, int i) {
        return i(E(inw0Var, i));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final dar r(Object obj, h661 h661Var) throws SerializationException {
        String str = (String) obj;
        if (!xfc1.b(h661Var)) {
            this.a.add(str);
            return this;
        }
        ega0 ega0VarE = e(str);
        String strH = h661Var.h();
        boolean z = ega0VarE instanceof aha0;
        nfa0 nfa0Var = this.c;
        if (z) {
            return new cga0(omo1.f(((aha0) ega0VarE).b(), nfa0Var), nfa0Var);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        jd11 jd11Var = rc11.a;
        sb.append(jd11Var.b(aha0.class).r());
        sb.append(", but had ");
        sb.append(jd11Var.b(ega0VarE.getClass()).r());
        throw new JsonDecodingException(vvm1.w(-1, l1d.n(" as the serialized body of ", strH, sb), L(str), (String) null, nfa0Var.a.m ? vvm1.C(-1, ega0VarE.toString()).toString() : null));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final int s(Object obj) throws SerializationException {
        String str = (String) obj;
        ega0 ega0VarE = e(str);
        if (!(ega0VarE instanceof aha0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jd11 jd11Var = rc11.a;
            sb.append(jd11Var.b(aha0.class).r());
            sb.append(", but had ");
            sb.append(jd11Var.b(ega0VarE.getClass()).r());
            sb.append(" as the serialized body of int");
            throw new JsonDecodingException(vvm1.w(-1, sb.toString(), L(str), (String) null, this.c.a.m ? vvm1.C(-1, ega0VarE.toString()).toString() : null));
        }
        aha0 aha0Var = (aha0) ega0VarE;
        try {
            long jO = fga0.o(aha0Var);
            Integer numValueOf = (-2147483648L > jO || jO > 2147483647L) ? null : Integer.valueOf((int) jO);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            O(aha0Var, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            O(aha0Var, "int", str);
            throw null;
        }
    }

    public final dar t(inw0 inw0Var, int i) {
        return r(E(inw0Var, i), inw0Var.g(i));
    }

    public final long u() {
        return v(I());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final long v(Object obj) throws SerializationException {
        String str = (String) obj;
        ega0 ega0VarE = e(str);
        if (ega0VarE instanceof aha0) {
            aha0 aha0Var = (aha0) ega0VarE;
            try {
                return fga0.o(aha0Var);
            } catch (IllegalArgumentException unused) {
                O(aha0Var, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        jd11 jd11Var = rc11.a;
        sb.append(jd11Var.b(aha0.class).r());
        sb.append(", but had ");
        sb.append(jd11Var.b(ega0VarE.getClass()).r());
        sb.append(" as the serialized body of long");
        throw new JsonDecodingException(vvm1.w(-1, sb.toString(), L(str), (String) null, this.c.a.m ? vvm1.C(-1, ega0VarE.toString()).toString() : null));
    }

    public final dar w(h661 h661Var) {
        if (o7h.C0(this.a) != null) {
            return r(I(), h661Var);
        }
        return new bha0(this.c, G(), this.d).w(h661Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final short x(Object obj) throws SerializationException {
        String str = (String) obj;
        ega0 ega0VarE = e(str);
        if (!(ega0VarE instanceof aha0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            jd11 jd11Var = rc11.a;
            sb.append(jd11Var.b(aha0.class).r());
            sb.append(", but had ");
            sb.append(jd11Var.b(ega0VarE.getClass()).r());
            sb.append(" as the serialized body of short");
            throw new JsonDecodingException(vvm1.w(-1, sb.toString(), L(str), (String) null, this.c.a.m ? vvm1.C(-1, ega0VarE.toString()).toString() : null));
        }
        aha0 aha0Var = (aha0) ega0VarE;
        try {
            long jO = fga0.o(aha0Var);
            Short shValueOf = (-32768 > jO || jO > 32767) ? null : Short.valueOf((short) jO);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            O(aha0Var, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            O(aha0Var, "short", str);
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final String y(Object obj) throws SerializationException {
        String str = (String) obj;
        ega0 ega0VarE = e(str);
        boolean z = ega0VarE instanceof aha0;
        nfa0 nfa0Var = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            jd11 jd11Var = rc11.a;
            sb.append(jd11Var.b(aha0.class).r());
            sb.append(", but had ");
            sb.append(jd11Var.b(ega0VarE.getClass()).r());
            sb.append(" as the serialized body of string");
            throw new JsonDecodingException(vvm1.w(-1, sb.toString(), L(str), (String) null, nfa0Var.a.m ? vvm1.C(-1, ega0VarE.toString()).toString() : null));
        }
        aha0 aha0Var = (aha0) ega0VarE;
        if (!(aha0Var instanceof nga0)) {
            throw new JsonDecodingException(vvm1.w(-1, f4i1.f("Expected string value for a non-null key '", str, "', got null literal instead"), L(str), "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", nfa0Var.a.m ? vvm1.C(-1, g().toString()).toString() : null));
        }
        nga0 nga0Var = (nga0) aha0Var;
        if (nga0Var.a || nfa0Var.a.c) {
            return nga0Var.c;
        }
        throw new JsonDecodingException(vvm1.w(-1, f4i1.f("String literal for value of key '", str, "' should be quoted"), L(str), "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", nfa0Var.a.m ? vvm1.C(-1, g().toString()).toString() : null));
    }

    public String z(h661 h661Var, int i) {
        return h661Var.e(i);
    }

    public void a(h661 h661Var) {
    }
}
