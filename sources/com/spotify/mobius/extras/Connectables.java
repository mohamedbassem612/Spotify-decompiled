package com.spotify.mobius.extras;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.extras.connections.ContramapConnection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class Connectables {

    /* JADX INFO: renamed from: com.spotify.mobius.extras.Connectables$1, reason: invalid class name */
    class AnonymousClass1 implements Function<Consumer<Object>, Connection<Object>> {
        public final /* synthetic */ Function a;
        public final /* synthetic */ Connectable b;

        public AnonymousClass1(Function function, Connectable connectable) {
            this.a = function;
            this.b = connectable;
        }

        public final Object apply(Object obj) {
            Consumer consumer = (Consumer) obj;
            Connectable connectable = this.b;
            connectable.getClass();
            consumer.getClass();
            return new ContramapConnection(this.a, connectable, consumer);
        }
    }

    public static SimpleConnectable a(Function function, Connectable connectable) {
        return new SimpleConnectable(new AnonymousClass1(function, connectable));
    }
}
