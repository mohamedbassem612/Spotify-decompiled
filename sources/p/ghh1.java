package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ghh1 {
    public final int a;
    public final bw91 b;
    public final bw91 c;

    public ghh1(int i, List list, List list2) {
        this.a = i;
        if (i < 0) {
            tf80.a("Capacity must be a positive integer");
        }
        if (list.size() + list2.size() > i) {
            tf80.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        bw91 bw91Var = new bw91();
        bw91Var.addAll(list);
        this.b = bw91Var;
        bw91 bw91Var2 = new bw91();
        bw91Var2.addAll(list2);
        this.c = bw91Var2;
    }
}
