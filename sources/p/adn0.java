package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class adn0 {
    public final Integer a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final Set m;

    public adn0(Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, int i, int i2, int i3, int i4, boolean z6, Set set) {
        this.a = num;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = list;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = z6;
        this.m = set;
    }

    public static adn0 a(adn0 adn0Var, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList arrayList, int i, int i2, int i3, int i4, boolean z6, Set set, int i5) {
        adn0Var.getClass();
        if ((i5 & 2) != 0) {
            num = adn0Var.a;
        }
        Integer num2 = num;
        boolean z7 = (i5 & 4) != 0 ? adn0Var.b : z;
        boolean z8 = (i5 & 8) != 0 ? adn0Var.c : z2;
        boolean z9 = (i5 & 16) != 0 ? adn0Var.d : z3;
        boolean z10 = (i5 & 32) != 0 ? adn0Var.e : z4;
        boolean z11 = (i5 & 64) != 0 ? adn0Var.f : z5;
        List list = (i5 & 128) != 0 ? adn0Var.g : arrayList;
        int i6 = (i5 & 256) != 0 ? adn0Var.h : i;
        int i7 = (i5 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? adn0Var.i : i2;
        int i8 = (i5 & 1024) != 0 ? adn0Var.j : i3;
        int i9 = (i5 & 2048) != 0 ? adn0Var.k : i4;
        boolean z12 = (i5 & 4096) != 0 ? adn0Var.l : z6;
        Set set2 = (i5 & 8192) != 0 ? adn0Var.m : set;
        adn0Var.getClass();
        return new adn0(num2, z7, z8, z9, z10, z11, list, i6, i7, i8, i9, z12, set2);
    }

    public static Integer b(Integer num) {
        int iIntValue;
        if (num == null || 1 > (iIntValue = num.intValue()) || iIntValue >= 3601) {
            return null;
        }
        return num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adn0)) {
            return false;
        }
        adn0 adn0Var = (adn0) obj;
        return u890.j(this.a, adn0Var.a) && this.b == adn0Var.b && this.c == adn0Var.c && this.d == adn0Var.d && this.e == adn0Var.e && this.f == adn0Var.f && u890.j(this.g, adn0Var.g) && this.h == adn0Var.h && this.i == adn0Var.i && this.j == adn0Var.j && this.k == adn0Var.k && this.l == adn0Var.l && u890.j(this.m, adn0Var.m);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.m.hashCode() + xcg1.g(kaa0.f(this.k, kaa0.f(this.j, kaa0.f(this.i, kaa0.f(this.h, f4i1.b(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31), 31), 31), 31, this.l);
    }
}
