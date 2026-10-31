package com.spotify.mobius.android;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.Preconditions;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p.kdn0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableMutableLiveData<T> extends kdn0 implements EventSource<Boolean> {
    public final CopyOnWriteArrayList Y = new CopyOnWriteArrayList();

    @Override // com.spotify.mobius.EventSource
    public final Disposable a(Consumer consumer) {
        Preconditions.b(consumer);
        this.Y.add(consumer);
        return new c(this, consumer);
    }

    public final void h() {
        Iterator it = this.Y.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(Boolean.TRUE);
        }
    }

    public final void i() {
        Iterator it = this.Y.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(Boolean.FALSE);
        }
    }
}
