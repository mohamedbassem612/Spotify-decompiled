package p;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fcf0 {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public ina1 h;
    public q5f0 i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public final dks0 a = new dks0();
    public final HashSet b = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f33p = 0;

    public final void a(String str) {
        nue0.c(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float fC = qpi1.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                this.d.put((String) entry.getKey(), ((hdf0) entry.getValue()).a(this.e / fC));
            }
        }
        this.e = fC;
        return this.d;
    }

    public final ntg0 d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            ntg0 ntg0Var = (ntg0) this.g.get(i);
            if (ntg0Var.a(str)) {
                return ntg0Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((qkb0) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
