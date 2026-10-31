package p;

import android.app.PendingIntent;
import com.google.android.gms.cast.internal.zzap;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wpn1 extends BasePendingResult {
    public lxh1 n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e321 f38p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpn1(e321 e321Var, boolean z) {
        super((j8n1) null);
        Objects.requireNonNull(e321Var);
        this.f38p = e321Var;
        this.o = z;
    }

    public final /* synthetic */ p331 d(Status status) {
        return new won1(this, status);
    }

    public abstract void l();

    public final gon1 m() {
        lxh1 lxh1Var = this.n;
        if (lxh1Var != null) {
            return lxh1Var;
        }
        lxh1 lxh1Var2 = new lxh1(this, (byte) 14);
        this.n = lxh1Var2;
        return lxh1Var2;
    }

    public final void n() {
        if (!this.o) {
            e321 e321Var = this.f38p;
            Iterator it = e321Var.g.iterator();
            if (it.hasNext()) {
                throw pze0.g(it);
            }
            Iterator it2 = e321Var.h.iterator();
            while (it2.hasNext()) {
                ((oxo1) it2.next()).getClass();
            }
        }
        try {
            synchronized (this.f38p.a) {
                l();
            }
        } catch (zzap unused) {
            g(new won1(this, new Status(2100, (String) null, (PendingIntent) null, (lal) null)));
        }
    }
}
