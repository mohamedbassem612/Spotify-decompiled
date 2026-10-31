package p;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ejf1 {
    public final int a;
    public final ie30 b;
    public boolean i;
    public byte[] j;
    public final boolean l;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    public final HashMap h = new HashMap();
    public long k = -9223372036854775807L;

    public ejf1(int i, ie30 ie30Var, boolean z) {
        this.a = i;
        this.b = ie30Var;
        this.l = z;
    }

    public final int a() {
        ie30 ie30Var = this.b;
        if (!asj0.k(ie30Var.f66p)) {
            return 90000;
        }
        int i = ie30Var.L;
        if (i != -1) {
            return i;
        }
        return 48000;
    }
}
