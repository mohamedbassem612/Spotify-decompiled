package com.spotify.mobius;

import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class MergedEventSource<E> implements EventSource<E> {
    public final ArrayList a;

    public MergedEventSource(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static MergedEventSource b(EventSource eventSource, EventSource... eventSourceArr) {
        ArrayList arrayList = new ArrayList();
        Preconditions.b(eventSource);
        arrayList.add(eventSource);
        for (EventSource eventSource2 : eventSourceArr) {
            Preconditions.b(eventSource2);
            arrayList.add(eventSource2);
        }
        return new MergedEventSource(arrayList);
    }

    @Override // com.spotify.mobius.EventSource
    public final Disposable a(Consumer consumer) {
        ArrayList arrayList = this.a;
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<E> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EventSource) it.next()).a(consumer));
        }
        return new Disposable() { // from class: com.spotify.mobius.MergedEventSource.1
            @Override // com.spotify.mobius.disposables.Disposable
            public final void dispose() {
                Iterator<E> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((Disposable) it2.next()).dispose();
                }
            }
        };
    }
}
