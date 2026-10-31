package p;

import java.util.TreeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class nmn0 {
    public TreeSet a;

    /* JADX WARN: Code duplicated, block: B:11:0x0010 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #1 {all -> 0x000e, blocks: (B:4:0x0003, B:6:0x0007, B:20:0x0029, B:22:0x002d, B:24:0x0033, B:11:0x0010, B:19:0x0027, B:18:0x0024, B:15:0x001e), top: B:31:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void a(boolean z) {
        omn0 omn0Var;
        TreeSet treeSetF;
        if (z) {
            omn0Var = omn0.a;
            treeSetF = null;
            if (!dhn.a.contains(omn0.class)) {
                treeSetF = omn0Var.f(this);
            }
            this.a = treeSetF;
        } else {
            try {
                TreeSet treeSet = this.a;
                if (treeSet == null || treeSet.isEmpty()) {
                    omn0Var = omn0.a;
                    treeSetF = null;
                    if (!dhn.a.contains(omn0.class)) {
                        try {
                            treeSetF = omn0Var.f(this);
                        } catch (Throwable th) {
                            dhn.a(omn0.class, th);
                        }
                    }
                    this.a = treeSetF;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TreeSet treeSet2 = this.a;
        if (treeSet2 == null || treeSet2.isEmpty()) {
            e();
        }
    }

    public String b() {
        return "com.facebook.katana.ProxyAuth";
    }

    public String c() {
        return "com.facebook.katana";
    }

    public String d() {
        return "id_token,token,signed_request,graph_domain";
    }

    public void e() {
    }
}
