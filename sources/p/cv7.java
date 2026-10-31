package p;

import android.os.Looper;
import android.widget.ImageView;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cv7 implements d0u0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public cv7() {
        this.a = (byte) 1;
        this.b = gio1.b(new z590((lsm0) null, false, l091.a, true, 0L, 0L, 0.0f, 0L, (y1k1) null));
    }

    public final c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new bv7((sf0) obj, m0u0Var, oot0Var);
            case 1:
                l811 l811Var = new l811();
                l811Var.a = oot0Var.c;
                return new sna(this, new p811(), l811Var);
            case 2:
                return new skd((vkd) obj);
            case 3:
                return new uvd(m0u0Var, oot0Var, this);
            case 4:
                return new jid((k0t) obj, (byte) 1);
            case 5:
                return new rq20((ImageView) obj);
            case 6:
                return new jid((ven0) obj, (byte) 2);
            case 7:
                return (d9c1) obj;
            case 8:
                return new ezc1((dpa) obj);
            case 9:
                List listL1 = o7h.l1((Iterable) ((zem0) obj).invoke());
                if (listL1.isEmpty()) {
                    return null;
                }
                String str2 = m0u0Var.d;
                ArrayList arrayList = new ArrayList();
                Iterator it = listL1.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        bhn0.d();
                        return null;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    try {
                        throw null;
                    } catch (Exception e) {
                        try {
                            if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                                throw new IllegalStateException("Playback signposts must be accessed on the main thread");
                            }
                            Iterator it2 = o7h.l1(linkedHashSet).iterator();
                            if (it2.hasNext()) {
                                if (it2.next() == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            }
                            Logger.l(e, "Multiplayer playback observer factory failed", new Object[0]);
                        } catch (Exception e2) {
                            Logger.l(e2, "Multiplayer playback signpost cleanup failed", new Object[0]);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                hoa hoaVar = new hoa();
                hoaVar.a = arrayList;
                return hoaVar;
            case 10:
                return (djj1) obj;
            case 11:
                return new nrj1((cds) obj);
            case 12:
                return new asj1((bsj1) obj);
            case 13:
                return (c0u0) obj;
            default:
                return (djj1) obj;
        }
    }

    public bpb1 b() {
        return (bpb1) this.b;
    }

    public void c(iu30 iu30Var) {
        bpb1 bpb1Var = (bpb1) this.b;
        bpb1Var.l(iu30Var.invoke(bpb1Var.getValue()));
    }

    public /* synthetic */ cv7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
