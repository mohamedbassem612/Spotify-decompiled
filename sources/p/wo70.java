package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.musicappplatform.state.idle.api.MusicAppLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wo70 implements oo70 {
    public final ArrayList a;
    public final llm d;
    public final llm e;
    public volatile faa0 f;
    public final bpb1 b = gio1.b(d06.a);
    public final xgn0 c = ygn0.a();
    public final LinkedHashSet g = new LinkedHashSet();

    public wo70(gzm0 gzm0Var, ArrayList arrayList, q8n q8nVar, q8n q8nVar2) {
        this.a = arrayList;
        this.d = smo1.e(ilo1.B(q8nVar, guo1.B()).y(new z8n("IdleManagerScope")).y(new v62((byte) 10)));
        this.e = smo1.e(ilo1.B(q8nVar2, guo1.B()).y(new z8n("IdleManager-AuditScope")).y(new v62((byte) 11)));
    }

    public final void a(MusicAppLock musicAppLock) {
        c921.D(new k53(this, musicAppLock, (lnm) null, (byte) 14));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(MusicAppLock musicAppLock, onm onmVar) {
        qo70 qo70Var;
        xgn0 xgn0Var;
        if (onmVar instanceof qo70) {
            qo70Var = (qo70) onmVar;
            int i = qo70Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qo70Var.e = i - Integer.MIN_VALUE;
            } else {
                qo70Var = new qo70(this, onmVar);
            }
        } else {
            qo70Var = new qo70(this, onmVar);
        }
        Object obj = qo70Var.c;
        int i2 = qo70Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            qo70Var.a = musicAppLock;
            xgn0Var = this.c;
            qo70Var.b = xgn0Var;
            qo70Var.e = 1;
            Object objA = xgn0Var.a(qo70Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xgn0 xgn0Var2 = qo70Var.b;
            MusicAppLock musicAppLock2 = qo70Var.a;
            hm5.M(obj);
            xgn0Var = xgn0Var2;
            musicAppLock = musicAppLock2;
        }
        try {
            d(musicAppLock);
            return rih1.a;
        } finally {
            xgn0Var.c(null);
        }
    }

    public final void c() {
        faa0 faa0Var = this.f;
        if (faa0Var != null) {
            faa0Var.d(new CancellationException("IdleTimer is cancelled"));
            c921.y(this.e, (o8n) null, 0, new ro70(this, (lnm) null, (byte) 0), 3);
            this.f = null;
        }
    }

    public final void d(MusicAppLock musicAppLock) {
        LinkedHashSet linkedHashSet = this.g;
        boolean zAdd = linkedHashSet.add(musicAppLock);
        llm llmVar = this.e;
        if (!zAdd) {
            linkedHashSet.remove(musicAppLock);
            linkedHashSet.add(musicAppLock);
            c921.y(llmVar, (o8n) null, 0, new so70(this, (lnm) null, musicAppLock, (byte) 0), 3);
            return;
        }
        c921.y(llmVar, (o8n) null, 0, new xw0(this, (lnm) null, musicAppLock), 3);
        bpb1 bpb1Var = this.b;
        if (u890.j(bpb1Var.getValue(), d06.a)) {
            c921.y(llmVar, (o8n) null, 0, new ro70(this, (lnm) null, (byte) 1), 3);
            bpb1Var.m(null, c06.a);
        }
        c();
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (!((MusicAppLock) it.next()).getWeak()) {
                    return;
                }
            }
        }
        linkedHashSet.clear();
        j(600000L);
    }

    public final void e(MusicAppLock musicAppLock) {
        LinkedHashSet linkedHashSet = this.g;
        boolean zRemove = linkedHashSet.remove(musicAppLock);
        llm llmVar = this.e;
        if (!zRemove) {
            c921.y(llmVar, (o8n) null, 0, new so70(this, (lnm) null, musicAppLock, (byte) 2), 3);
            return;
        }
        boolean z = true;
        c921.y(llmVar, (o8n) null, 0, new so70(this, (lnm) null, musicAppLock, (byte) 1), 3);
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (!((MusicAppLock) it.next()).getWeak()) {
                    z = false;
                    break;
                }
            }
        }
        if (linkedHashSet.isEmpty() || z) {
            linkedHashSet.clear();
            Logger.b("Starting timeout: 600 sec", new Object[0]);
            j(600000L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(onm onmVar) {
        to70 to70Var;
        xgn0 xgn0Var;
        if (onmVar instanceof to70) {
            to70Var = (to70) onmVar;
            int i = to70Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                to70Var.d = i - Integer.MIN_VALUE;
            } else {
                to70Var = new to70(this, onmVar);
            }
        } else {
            to70Var = new to70(this, onmVar);
        }
        Object obj = to70Var.b;
        int i2 = to70Var.d;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj);
            xgn0 xgn0Var2 = this.c;
            to70Var.a = xgn0Var2;
            to70Var.d = 1;
            Object objA = xgn0Var2.a(to70Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            xgn0Var = xgn0Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xgn0Var = to70Var.a;
            hm5.M(obj);
        }
        try {
            Iterator it = o7h.l1(this.g).iterator();
            while (it.hasNext()) {
                e((MusicAppLock) it.next());
            }
            c();
            c921.y(this.e, (o8n) null, 0, new q82(this, lnmVar, (byte) 9), 3);
            this.b.m(null, d06.a);
            return rih1.a;
        } finally {
            xgn0Var.c(null);
        }
    }

    public final void g(MusicAppLock musicAppLock) {
        c921.D(new x060(this, musicAppLock, (lnm) null, (byte) 11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(MusicAppLock musicAppLock, onm onmVar) {
        uo70 uo70Var;
        xgn0 xgn0Var;
        if (onmVar instanceof uo70) {
            uo70Var = (uo70) onmVar;
            int i = uo70Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                uo70Var.e = i - Integer.MIN_VALUE;
            } else {
                uo70Var = new uo70(this, onmVar);
            }
        } else {
            uo70Var = new uo70(this, onmVar);
        }
        Object obj = uo70Var.c;
        int i2 = uo70Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            uo70Var.a = musicAppLock;
            xgn0Var = this.c;
            uo70Var.b = xgn0Var;
            uo70Var.e = 1;
            Object objA = xgn0Var.a(uo70Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xgn0 xgn0Var2 = uo70Var.b;
            MusicAppLock musicAppLock2 = uo70Var.a;
            hm5.M(obj);
            xgn0Var = xgn0Var2;
            musicAppLock = musicAppLock2;
        }
        try {
            e(musicAppLock);
            return rih1.a;
        } finally {
            xgn0Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(onm onmVar) {
        vo70 vo70Var;
        xgn0 xgn0Var;
        if (onmVar instanceof vo70) {
            vo70Var = (vo70) onmVar;
            int i = vo70Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vo70Var.d = i - Integer.MIN_VALUE;
            } else {
                vo70Var = new vo70(this, onmVar);
            }
        } else {
            vo70Var = new vo70(this, onmVar);
        }
        Object obj = vo70Var.b;
        int i2 = vo70Var.d;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj);
            xgn0 xgn0Var2 = this.c;
            vo70Var.a = xgn0Var2;
            vo70Var.d = 1;
            Object objA = xgn0Var2.a(vo70Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            xgn0Var = xgn0Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xgn0Var = vo70Var.a;
            hm5.M(obj);
        }
        try {
            c921.y(this.e, (o8n) null, 0, new q82(this, lnmVar, (byte) 9), 3);
            this.b.m(null, d06.a);
            return rih1.a;
        } finally {
            xgn0Var.c(null);
        }
    }

    public final void j(long j) {
        this.f = c921.y(this.d, (o8n) null, 0, new jt0(j, this, (lnm) null, (byte) 1), 3);
        c921.y(this.e, (o8n) null, 0, new ro70(this, (lnm) null, (byte) 2), 3);
    }
}
