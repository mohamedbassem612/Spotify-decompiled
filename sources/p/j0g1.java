package p;

import androidx.car.app.model.Alert;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class j0g1 {
    public boolean A;
    public b380 B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;
    public int e;
    public int f;
    public int g;
    public int h;
    public b380 m;
    public b380 n;
    public b380 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77p;
    public b380 q;
    public b380 r;
    public int s;
    public int t;
    public int u;
    public b380 v;
    public i0g1 w;
    public boolean x;
    public b380 y;
    public int z;
    public int a = Alert.DURATION_SHOW_INDEFINITELY;
    public int b = Alert.DURATION_SHOW_INDEFINITELY;
    public int c = Alert.DURATION_SHOW_INDEFINITELY;
    public int d = Alert.DURATION_SHOW_INDEFINITELY;
    public int i = Alert.DURATION_SHOW_INDEFINITELY;
    public int j = Alert.DURATION_SHOW_INDEFINITELY;
    public boolean k = true;
    public boolean l = true;

    public j0g1() {
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        this.m = bg11Var;
        this.n = bg11Var;
        this.o = bg11Var;
        this.f77p = 0;
        this.q = bg11Var;
        this.r = bg11Var;
        this.s = 0;
        this.t = Alert.DURATION_SHOW_INDEFINITELY;
        this.u = Alert.DURATION_SHOW_INDEFINITELY;
        this.v = bg11Var;
        this.w = i0g1.d;
        this.x = false;
        this.y = bg11Var;
        this.z = 0;
        this.A = true;
        this.B = bg11Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static bg11 e(String[] strArr) {
        v280 v280VarM = b380.m();
        for (String str : strArr) {
            str.getClass();
            v280VarM.c(zoi1.X(str));
        }
        return v280VarM.g();
    }

    public void a(h0g1 h0g1Var) {
        this.H.put(h0g1Var.a, h0g1Var);
    }

    public k0g1 b() {
        return new k0g1(this);
    }

    public j0g1 c() {
        this.H.clear();
        return this;
    }

    public final void d(k0g1 k0g1Var) {
        this.a = k0g1Var.a;
        this.b = k0g1Var.b;
        this.c = k0g1Var.c;
        this.d = k0g1Var.d;
        this.e = k0g1Var.e;
        this.f = k0g1Var.f;
        this.g = k0g1Var.g;
        this.h = k0g1Var.h;
        this.i = k0g1Var.i;
        this.j = k0g1Var.j;
        this.k = k0g1Var.k;
        this.l = k0g1Var.l;
        this.n = k0g1Var.n;
        this.m = k0g1Var.m;
        this.o = k0g1Var.o;
        this.f77p = k0g1Var.f79p;
        this.q = k0g1Var.q;
        this.s = k0g1Var.s;
        this.r = k0g1Var.r;
        this.t = k0g1Var.t;
        this.u = k0g1Var.u;
        this.v = k0g1Var.v;
        this.w = k0g1Var.w;
        this.x = k0g1Var.x;
        this.y = k0g1Var.y;
        this.z = k0g1Var.A;
        this.A = k0g1Var.B;
        this.B = k0g1Var.z;
        this.C = k0g1Var.C;
        this.D = k0g1Var.D;
        this.E = k0g1Var.E;
        this.F = k0g1Var.F;
        this.G = k0g1Var.G;
        this.I = new HashSet((Collection) k0g1Var.I);
        this.H = new HashMap((Map) k0g1Var.H);
    }

    public j0g1 f(h0g1 h0g1Var) {
        int i = h0g1Var.a.c;
        Iterator it = this.H.values().iterator();
        while (it.hasNext()) {
            if (((h0g1) it.next()).a.c == i) {
                it.remove();
            }
        }
        this.H.put(h0g1Var.a, h0g1Var);
        return this;
    }

    public j0g1 g(String... strArr) {
        this.q = e(strArr);
        return this;
    }

    public j0g1 h(String... strArr) {
        this.y = e(strArr);
        this.A = false;
        return this;
    }

    public void i(int i, boolean z) {
        HashSet hashSet = this.I;
        if (z) {
            hashSet.add(Integer.valueOf(i));
        } else {
            hashSet.remove(Integer.valueOf(i));
        }
    }
}
