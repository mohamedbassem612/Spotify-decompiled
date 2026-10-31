package p;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class k0g1 {
    public static final k0g1 J = new k0g1(new j0g1());
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public final int A;
    public final boolean B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final j380 H;
    public final t380 I;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final b380 m;
    public final b380 n;
    public final b380 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f79p;
    public final b380 q;
    public final b380 r;
    public final int s;
    public final int t;
    public final int u;
    public final b380 v;
    public final i0g1 w;
    public final boolean x;
    public final b380 y;
    public final b380 z;

    static {
        String str = zoi1.a;
        K = Integer.toString(1, 36);
        L = Integer.toString(2, 36);
        M = Integer.toString(3, 36);
        N = Integer.toString(4, 36);
        O = Integer.toString(5, 36);
        P = Integer.toString(6, 36);
        Q = Integer.toString(7, 36);
        R = Integer.toString(8, 36);
        S = Integer.toString(9, 36);
        T = Integer.toString(10, 36);
        U = Integer.toString(11, 36);
        V = Integer.toString(12, 36);
        W = Integer.toString(13, 36);
        X = Integer.toString(14, 36);
        Y = Integer.toString(15, 36);
        Z = Integer.toString(16, 36);
        a0 = Integer.toString(17, 36);
        b0 = Integer.toString(18, 36);
        c0 = Integer.toString(19, 36);
        d0 = Integer.toString(20, 36);
        e0 = Integer.toString(21, 36);
        f0 = Integer.toString(22, 36);
        g0 = Integer.toString(23, 36);
        h0 = Integer.toString(24, 36);
        i0 = Integer.toString(25, 36);
        j0 = Integer.toString(26, 36);
        k0 = Integer.toString(27, 36);
        l0 = Integer.toString(28, 36);
        m0 = Integer.toString(29, 36);
        n0 = Integer.toString(30, 36);
        o0 = Integer.toString(31, 36);
        p0 = Integer.toString(32, 36);
        q0 = Integer.toString(33, 36);
        r0 = Integer.toString(34, 36);
        s0 = Integer.toString(35, 36);
        t0 = Integer.toString(36, 36);
        u0 = Integer.toString(37, 36);
        v0 = Integer.toString(38, 36);
    }

    public k0g1(j0g1 j0g1Var) {
        this.a = j0g1Var.a;
        this.b = j0g1Var.b;
        this.c = j0g1Var.c;
        this.d = j0g1Var.d;
        this.e = j0g1Var.e;
        this.f = j0g1Var.f;
        this.g = j0g1Var.g;
        this.h = j0g1Var.h;
        this.i = j0g1Var.i;
        this.j = j0g1Var.j;
        this.k = j0g1Var.k;
        this.l = j0g1Var.l;
        this.m = j0g1Var.m;
        this.n = j0g1Var.n;
        this.o = j0g1Var.o;
        this.f79p = j0g1Var.f77p;
        this.q = j0g1Var.q;
        this.s = j0g1Var.s;
        this.t = j0g1Var.t;
        this.r = j0g1Var.r;
        this.u = j0g1Var.u;
        this.v = j0g1Var.v;
        this.w = j0g1Var.w;
        this.x = j0g1Var.x;
        this.y = j0g1Var.y;
        this.A = j0g1Var.z;
        this.B = j0g1Var.A;
        this.z = j0g1Var.B;
        this.C = j0g1Var.C;
        this.D = j0g1Var.D;
        this.E = j0g1Var.E;
        this.F = j0g1Var.F;
        this.G = j0g1Var.G;
        this.H = j380.c(j0g1Var.H);
        this.I = t380.p(j0g1Var.I);
    }

    public static k0g1 b(Bundle bundle) {
        i0g1 i0g1Var;
        bg11 bg11VarG;
        j0g1 j0g1Var = new j0g1();
        k0g1 k0g1Var = J;
        j0g1Var.a = bundle.getInt(P, k0g1Var.a);
        j0g1Var.b = bundle.getInt(Q, k0g1Var.b);
        j0g1Var.c = bundle.getInt(R, k0g1Var.c);
        j0g1Var.d = bundle.getInt(S, k0g1Var.d);
        j0g1Var.e = bundle.getInt(T, k0g1Var.e);
        j0g1Var.f = bundle.getInt(U, k0g1Var.f);
        j0g1Var.g = bundle.getInt(V, k0g1Var.g);
        j0g1Var.h = bundle.getInt(W, k0g1Var.h);
        j0g1Var.i = bundle.getInt(X, k0g1Var.i);
        int i = bundle.getInt(Y, k0g1Var.j);
        j0g1Var.j = i;
        j0g1Var.k = j0g1Var.i == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(q0, k0g1Var.k);
        j0g1Var.l = bundle.getBoolean(Z, k0g1Var.l);
        j0g1Var.m = b380.q((String[]) cwl1.y(bundle.getStringArray(a0), new String[0]));
        j0g1Var.n = b380.q((String[]) cwl1.y(bundle.getStringArray(t0), new String[0]));
        j0g1Var.o = b380.q((String[]) cwl1.y(bundle.getStringArray(p0), new String[0]));
        j0g1Var.f77p = bundle.getInt(i0, k0g1Var.f79p);
        j0g1Var.q = j0g1.e((String[]) cwl1.y(bundle.getStringArray(K), new String[0]));
        j0g1Var.r = b380.q((String[]) cwl1.y(bundle.getStringArray(u0), new String[0]));
        j0g1Var.s = bundle.getInt(L, k0g1Var.s);
        j0g1Var.t = bundle.getInt(b0, k0g1Var.t);
        j0g1Var.u = bundle.getInt(c0, k0g1Var.u);
        j0g1Var.v = b380.q((String[]) cwl1.y(bundle.getStringArray(d0), new String[0]));
        Bundle bundle2 = bundle.getBundle(n0);
        if (bundle2 != null) {
            l6w0 l6w0Var = new l6w0();
            String str = i0g1.e;
            i0g1 i0g1Var2 = i0g1.d;
            l6w0Var.a = bundle2.getInt(str, i0g1Var2.a);
            l6w0Var.b = bundle2.getBoolean(i0g1.f, i0g1Var2.b);
            l6w0Var.c = bundle2.getBoolean(i0g1.g, i0g1Var2.c);
            i0g1Var = new i0g1(l6w0Var);
        } else {
            l6w0 l6w0Var2 = new l6w0();
            i0g1 i0g1Var3 = i0g1.d;
            l6w0Var2.a = bundle.getInt(k0, i0g1Var3.a);
            l6w0Var2.b = bundle.getBoolean(l0, i0g1Var3.b);
            l6w0Var2.c = bundle.getBoolean(m0, i0g1Var3.c);
            i0g1Var = new i0g1(l6w0Var2);
        }
        j0g1Var.w = i0g1Var;
        j0g1Var.x = bundle.getBoolean(s0, k0g1Var.x);
        j0g1Var.y = j0g1.e((String[]) cwl1.y(bundle.getStringArray(M), new String[0]));
        j0g1Var.z = bundle.getInt(N, k0g1Var.A);
        j0g1Var.A = j0g1Var.y.isEmpty() && j0g1Var.z == 0 && bundle.getBoolean(r0, k0g1Var.B);
        j0g1Var.C = bundle.getInt(j0, k0g1Var.C);
        j0g1Var.B = b380.q((String[]) cwl1.y(bundle.getStringArray(v0), new String[0]));
        j0g1Var.D = bundle.getBoolean(O, k0g1Var.D);
        j0g1Var.E = bundle.getBoolean(o0, k0g1Var.E);
        j0g1Var.F = bundle.getBoolean(e0, k0g1Var.F);
        j0g1Var.G = bundle.getBoolean(f0, k0g1Var.G);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g0);
        if (parcelableArrayList == null) {
            bg11VarG = bg11.e;
        } else {
            v280 v280VarM = b380.m();
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i2);
                bundle3.getClass();
                Bundle bundle4 = bundle3.getBundle(h0g1.c);
                bundle4.getClass();
                pnf1 pnf1VarA = pnf1.a(bundle4);
                int[] intArray = bundle3.getIntArray(h0g1.d);
                intArray.getClass();
                v280VarM.c(new h0g1(pnf1VarA, bmq0.f(intArray)));
            }
            bg11VarG = v280VarM.g();
        }
        j0g1Var.H = new HashMap();
        for (int i3 = 0; i3 < bg11VarG.d; i3++) {
            h0g1 h0g1Var = (h0g1) bg11VarG.get(i3);
            j0g1Var.H.put(h0g1Var.a, h0g1Var);
        }
        int[] iArr = (int[]) cwl1.y(bundle.getIntArray(h0), new int[0]);
        j0g1Var.I = new HashSet();
        for (int i4 : iArr) {
            j0g1Var.I.add(Integer.valueOf(i4));
        }
        return new k0g1(j0g1Var);
    }

    public j0g1 a() {
        j0g1 j0g1Var = new j0g1();
        j0g1Var.d(this);
        return j0g1Var;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(P, this.a);
        bundle.putInt(Q, this.b);
        bundle.putInt(R, this.c);
        bundle.putInt(S, this.d);
        bundle.putInt(T, this.e);
        bundle.putInt(U, this.f);
        bundle.putInt(V, this.g);
        bundle.putInt(W, this.h);
        bundle.putInt(X, this.i);
        bundle.putInt(Y, this.j);
        bundle.putBoolean(q0, this.k);
        bundle.putBoolean(Z, this.l);
        bundle.putStringArray(a0, (String[]) this.m.toArray(new String[0]));
        bundle.putStringArray(p0, (String[]) this.o.toArray(new String[0]));
        bundle.putStringArray(t0, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(i0, this.f79p);
        bundle.putStringArray(K, (String[]) this.q.toArray(new String[0]));
        bundle.putInt(L, this.s);
        bundle.putInt(b0, this.t);
        bundle.putInt(c0, this.u);
        bundle.putStringArray(u0, (String[]) this.r.toArray(new String[0]));
        bundle.putStringArray(d0, (String[]) this.v.toArray(new String[0]));
        bundle.putBoolean(s0, this.x);
        bundle.putStringArray(M, (String[]) this.y.toArray(new String[0]));
        bundle.putInt(N, this.A);
        bundle.putBoolean(r0, this.B);
        bundle.putStringArray(v0, (String[]) this.z.toArray(new String[0]));
        bundle.putInt(j0, this.C);
        bundle.putBoolean(O, this.D);
        i0g1 i0g1Var = this.w;
        bundle.putInt(k0, i0g1Var.a);
        boolean z = i0g1Var.b;
        bundle.putBoolean(l0, z);
        boolean z2 = i0g1Var.c;
        bundle.putBoolean(m0, z2);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(i0g1.e, i0g1Var.a);
        bundle2.putBoolean(i0g1.f, z);
        bundle2.putBoolean(i0g1.g, z2);
        bundle.putBundle(n0, bundle2);
        bundle.putBoolean(o0, this.E);
        bundle.putBoolean(e0, this.F);
        bundle.putBoolean(f0, this.G);
        q280<h0g1> q280VarO = this.H.o();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(q280VarO.size());
        for (h0g1 h0g1Var : q280VarO) {
            h0g1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle(h0g1.c, h0g1Var.a.d());
            bundle3.putIntArray(h0g1.d, bmq0.b0(h0g1Var.b));
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList(g0, arrayList);
        bundle.putIntArray(h0, bmq0.b0(this.I));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k0g1 k0g1Var = (k0g1) obj;
        if (this.a != k0g1Var.a || this.b != k0g1Var.b || this.c != k0g1Var.c || this.d != k0g1Var.d || this.e != k0g1Var.e || this.f != k0g1Var.f || this.g != k0g1Var.g || this.h != k0g1Var.h || this.l != k0g1Var.l || this.i != k0g1Var.i || this.j != k0g1Var.j || this.k != k0g1Var.k) {
            return false;
        }
        b380 b380Var = k0g1Var.m;
        b380 b380Var2 = this.m;
        b380Var2.getClass();
        if (!z1p1.j(b380Var2, b380Var)) {
            return false;
        }
        b380 b380Var3 = k0g1Var.n;
        b380 b380Var4 = this.n;
        b380Var4.getClass();
        if (!z1p1.j(b380Var4, b380Var3)) {
            return false;
        }
        b380 b380Var5 = k0g1Var.o;
        b380 b380Var6 = this.o;
        b380Var6.getClass();
        if (!z1p1.j(b380Var6, b380Var5) || this.f79p != k0g1Var.f79p) {
            return false;
        }
        b380 b380Var7 = k0g1Var.q;
        b380 b380Var8 = this.q;
        b380Var8.getClass();
        if (!z1p1.j(b380Var8, b380Var7) || this.s != k0g1Var.s || this.t != k0g1Var.t) {
            return false;
        }
        b380 b380Var9 = k0g1Var.r;
        b380 b380Var10 = this.r;
        b380Var10.getClass();
        if (!z1p1.j(b380Var10, b380Var9) || this.u != k0g1Var.u) {
            return false;
        }
        b380 b380Var11 = k0g1Var.v;
        b380 b380Var12 = this.v;
        b380Var12.getClass();
        if (!z1p1.j(b380Var12, b380Var11) || !this.w.equals(k0g1Var.w) || this.x != k0g1Var.x) {
            return false;
        }
        b380 b380Var13 = k0g1Var.z;
        b380 b380Var14 = this.z;
        b380Var14.getClass();
        if (!z1p1.j(b380Var14, b380Var13)) {
            return false;
        }
        b380 b380Var15 = k0g1Var.y;
        b380 b380Var16 = this.y;
        b380Var16.getClass();
        if (z1p1.j(b380Var16, b380Var15) && this.A == k0g1Var.A && this.B == k0g1Var.B && this.C == k0g1Var.C && this.D == k0g1Var.D && this.E == k0g1Var.E && this.F == k0g1Var.F && this.G == k0g1Var.G) {
            return mno1.l(k0g1Var.H, this.H) && this.I.equals(k0g1Var.I);
        }
        return false;
    }

    public int hashCode() {
        return this.I.hashCode() + ((this.H.hashCode() + ((((((((((((this.z.hashCode() + ((((((this.y.hashCode() + ((((this.w.hashCode() + ((this.v.hashCode() + ((((this.r.hashCode() + ((((((this.q.hashCode() + ((((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31)) * 31)) * 31)) * 31) + this.f79p) * 31)) * 31) + this.s) * 31) + this.t) * 31)) * 31) + this.u) * 31)) * 31)) * 31) + (this.x ? 1 : 0)) * 31)) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31)) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31)) * 31);
    }
}
