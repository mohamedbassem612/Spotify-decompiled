package com.spotify.mobius.extras;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class CompositeLogger<M, E, F> implements MobiusLoop.Logger<M, E, F> {
    public final ArrayList a;
    public final ArrayList b;

    public CompositeLogger(ArrayList arrayList) {
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.b = arrayList2;
        Collections.reverse(arrayList2);
    }

    public static CompositeLogger g(MobiusLoop.Logger logger, MobiusLoop.Logger... loggerArr) {
        ArrayList arrayList = new ArrayList();
        logger.getClass();
        arrayList.add(logger);
        for (MobiusLoop.Logger logger2 : loggerArr) {
            logger2.getClass();
            arrayList.add(logger2);
        }
        return new CompositeLogger(arrayList);
    }

    public final void a(Object obj, Object obj2, Next next) {
        Iterator<E> it = this.b.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).a(obj, obj2, next);
        }
    }

    public final void b(Object obj, Object obj2, Exception exc) {
        Iterator<E> it = this.b.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).b(obj, obj2, exc);
        }
    }

    public final void c(Object obj, First first) {
        Iterator<E> it = this.b.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).c(obj, first);
        }
    }

    public final void d(Object obj, Object obj2) {
        Iterator<E> it = this.a.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).d(obj, obj2);
        }
    }

    public final void e(Object obj) {
        Iterator<E> it = this.a.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).e(obj);
        }
    }

    public final void f(Object obj, Exception exc) {
        Iterator<E> it = this.b.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).f(obj, exc);
        }
    }
}
