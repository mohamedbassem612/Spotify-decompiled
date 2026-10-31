package p;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k3w0 implements h611 {
    public final bk7 a;
    public final p3w0 b;
    public final kly0 c;
    public final idd1 d = new idd1(new i3w0(this, (byte) 1));
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashSet f = new LinkedHashSet();

    public k3w0(bk7 bk7Var, p3w0 p3w0Var, kly0 kly0Var) {
        this.a = bk7Var;
        this.b = p3w0Var;
        this.c = kly0Var;
    }

    public static RecyclerView b(View view) {
        View childAt;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            childAt = null;
            break;
        }
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                childAt = null;
                break;
            }
            int i2 = i + 1;
            childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                tw20.p();
                return null;
            }
            if (childAt instanceof RecyclerView) {
                break;
            }
            i = i2;
        }
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    public final void a(View view) throws Exception {
        d(view);
        RecyclerView recyclerViewB = b(view);
        if (recyclerViewB == null || !this.f.remove(recyclerViewB)) {
            return;
        }
        recyclerViewB.o0(this);
        int childCount = recyclerViewB.getChildCount();
        for (int i = 0; i < childCount; i++) {
            d(recyclerViewB.getChildAt(i));
        }
    }

    public final void c(View view) {
        nui0 nui0VarT;
        RecyclerView parent = view.getParent();
        d4v0 j3w0Var = null;
        RecyclerView recyclerView = parent instanceof RecyclerView ? parent : null;
        idd1 idd1Var = this.d;
        if (recyclerView != null) {
            LinkedHashMap linkedHashMap = this.e;
            if (!linkedHashMap.containsKey(view) && (nui0VarT = recyclerView.T(view)) != null) {
                if (nui0VarT instanceof nui0) {
                    j3w0Var = new d4v0(nui0VarT, this, recyclerView, view);
                } else {
                    int iR = RecyclerView.R(view);
                    if (iR != -1) {
                        Object objA = this.a.A(iR);
                        if (objA instanceof mui0) {
                            j3w0Var = new i3w0(this, (byte) 0);
                        } else if (objA instanceof q4w0) {
                            j3w0Var = new j3w0(this, iR, (byte) 0);
                        } else if (objA instanceof ljd0) {
                            j3w0Var = new j3w0(this, iR, (byte) 1);
                        }
                    }
                }
                if (j3w0Var != null) {
                    linkedHashMap.put(view, ((gik1) idd1Var.getValue()).a(view, j3w0Var));
                }
            }
        }
        RecyclerView recyclerViewB = b(view);
        if (recyclerViewB != null) {
            gik1.b(recyclerViewB);
            if (this.f.add(recyclerViewB)) {
                recyclerViewB.k(this);
            }
        }
    }

    public final void d(View view) throws Exception {
        boolean zIsTerminated;
        AutoCloseable autoCloseable = (AutoCloseable) this.e.remove(view);
        if (autoCloseable != null) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    bhn0.q();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
