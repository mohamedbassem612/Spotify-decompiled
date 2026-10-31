package p;

import androidx.car.app.model.Alert;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u90 {
    public final HashSet a;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public boolean e;
    public byte f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public trd k;

    public u90(v90 v90Var) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        HashSet hashSet2 = new HashSet();
        this.b = hashSet2;
        HashSet hashSet3 = new HashSet();
        this.c = hashSet3;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = false;
        this.j = false;
        trd trdVar = trd.b;
        this.d = v90Var.a;
        this.e = v90Var.b;
        this.f = v90Var.c;
        this.k = v90Var.h;
        hashSet.addAll(v90Var.i);
        hashSet2.addAll(v90Var.j);
        hashSet3.addAll(v90Var.k);
        this.g = v90Var.d;
        this.h = v90Var.e;
        this.i = v90Var.f;
        this.j = v90Var.g;
    }

    public final void a(int i) {
        this.c.add(Integer.valueOf(i));
    }

    public final void b() {
        new v90(this);
    }

    public u90() {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new HashSet();
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = false;
        this.j = false;
        this.k = trd.c;
    }
}
