package p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class w611 {
    public static final List T0 = Collections.EMPTY_LIST;
    public RecyclerView R0;
    public z511 S0;
    public final View a;
    public WeakReference b;
    public int t;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public w611 h = null;
    public w611 i = null;
    public ArrayList X = null;
    public List Y = null;
    public int Z = 0;
    public n611 N0 = null;
    public boolean O0 = false;
    public int P0 = 0;
    public int Q0 = -1;

    public w611(View view) {
        if (view != null) {
            this.a = view;
        } else {
            hhg1.n("itemView may not be null");
            throw null;
        }
    }

    public final void A() {
        if (RecyclerView.b2 && x()) {
            bhn0.u("Attempting to reset temp-detached ViewHolder: ", this, ". ViewHolders should be fully detached before resetting.");
            return;
        }
        this.t = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.Z = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.X;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.t &= -1025;
        this.P0 = 0;
        this.Q0 = -1;
        RecyclerView.o(this);
    }

    public final void B(boolean z) {
        int i = this.Z;
        int i2 = z ? i - 1 : i + 1;
        this.Z = i2;
        if (i2 < 0) {
            this.Z = 0;
            if (RecyclerView.b2) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            toString();
        } else if (!z && i2 == 1) {
            this.t |= 16;
        } else if (z && i2 == 0) {
            this.t &= -17;
        }
        if (RecyclerView.c2) {
            toString();
        }
    }

    public final boolean C() {
        return (this.t & 128) != 0;
    }

    public final boolean D() {
        return (this.t & 32) != 0;
    }

    public final void j(int i) {
        this.t = i | this.t;
    }

    public final int m() {
        RecyclerView recyclerView = this.R0;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.P(this);
    }

    public final int n() {
        RecyclerView recyclerView;
        z511 adapter;
        int iP;
        if (this.S0 == null || (recyclerView = this.R0) == null || (adapter = recyclerView.getAdapter()) == null || (iP = this.R0.P(this)) == -1) {
            return -1;
        }
        return adapter.d(this.S0, this, iP);
    }

    public final int o() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final List p() {
        ArrayList arrayList;
        return ((this.t & 1024) != 0 || (arrayList = this.X) == null || arrayList.size() == 0) ? T0 : this.Y;
    }

    public final boolean r() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.R0) ? false : true;
    }

    public final boolean s() {
        return (this.t & 1) != 0;
    }

    public final boolean t() {
        return (this.t & 4) != 0;
    }

    public String toString() {
        StringBuilder sbG = dv20.g(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbG.append(Integer.toHexString(hashCode()));
        sbG.append(" position=");
        sbG.append(this.c);
        sbG.append(" id=");
        sbG.append(this.e);
        sbG.append(", oldPos=");
        sbG.append(this.d);
        sbG.append(", pLpos:");
        sbG.append(this.g);
        StringBuilder sb = new StringBuilder(sbG.toString());
        if (w()) {
            sb.append(" scrap ");
            sb.append(this.O0 ? "[changeScrap]" : "[attachedScrap]");
        }
        if (t()) {
            sb.append(" invalid");
        }
        if (!s()) {
            sb.append(" unbound");
        }
        if ((this.t & 2) != 0) {
            sb.append(" update");
        }
        if (v()) {
            sb.append(" removed");
        }
        if (C()) {
            sb.append(" ignored");
        }
        if (x()) {
            sb.append(" tmpDetached");
        }
        if (!u()) {
            sb.append(" not recyclable(" + this.Z + ")");
        }
        if ((this.t & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 || t()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        if ((this.t & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = b8k1.a;
        return !this.a.hasTransientState();
    }

    public final boolean v() {
        return (this.t & 8) != 0;
    }

    public final boolean w() {
        return this.N0 != null;
    }

    public final boolean x() {
        return (this.t & 256) != 0;
    }

    public final boolean y() {
        return (this.t & 2) != 0;
    }

    public final void z(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((g611) view.getLayoutParams()).c = true;
        }
    }
}
