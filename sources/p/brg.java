package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.contexts.DeviceAndroid;
import com.spotify.eventsender.Fragment;
import com.spotify.eventsender.FragmentsContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class brg {
    public final ue00 a;
    public final ld00 b;
    public final xk4 c;
    public final zq4 d;
    public final sc00 e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public brg(ue00 ue00Var, ld00 ld00Var, xk4 xk4Var, zq4 zq4Var, rc00 rc00Var) {
        this.a = ue00Var;
        this.b = ld00Var;
        this.c = xk4Var;
        this.d = zq4Var;
        this.e = rc00Var;
    }

    public final void a() {
        xk4 xk4Var = this.c;
        ue00 ue00Var = this.a;
        try {
            if (this.f.compareAndSet(false, true)) {
                List list = (List) qyo1.x(ue00Var.b, true, false, new kov(xk4Var.a(), (byte) 29));
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                ArrayList<ba00> arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!xk4Var.a().equals(b((ba00) obj))) {
                        arrayList.add(obj);
                    }
                }
                for (ba00 ba00Var : arrayList) {
                    linkedList.add(Long.valueOf(ba00Var.a));
                    linkedList2.add(ba00Var.d);
                }
                if (linkedList.size() > 999) {
                    ((rc00) this.e).d(oc00.TOO_MANY_CLONED_EVENTS);
                }
                qyo1.x(ue00Var.b, false, true, new lhx(ue00Var, linkedList, linkedList2, this.b, (byte) 6));
            }
        } catch (Exception e) {
            this.d.e("Error when trying to delete cloned events", e);
        }
    }

    public final String b(ba00 ba00Var) {
        FragmentsContainer fragmentsContainerP;
        Object next;
        String str = ba00Var.h;
        if (str != null) {
            return str;
        }
        try {
            fragmentsContainerP = FragmentsContainer.s(ba00Var.f);
        } catch (InvalidProtocolBufferException e) {
            this.d.e("Error in parsing contexts.", e);
            fragmentsContainerP = FragmentsContainer.p();
        }
        Iterator<E> it = fragmentsContainerP.q().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((Fragment) next).getName(), "context_device_android"));
        Fragment fragment = (Fragment) next;
        if (fragment == null) {
            return "";
        }
        try {
            String strN = DeviceAndroid.p(fragment.getData()).n();
            return strN == null ? "" : strN;
        } catch (InvalidProtocolBufferException unused) {
            return "";
        }
    }
}
