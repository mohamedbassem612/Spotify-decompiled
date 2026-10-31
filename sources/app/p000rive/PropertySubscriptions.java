package app.p000rive;

import app.p000rive.core.CommandQueue;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.o7h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lapp/rive/PropertySubscriptions;", "", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/core/ViewModelInstanceHandle;", "instanceHandle", "<init>", "(Lapp/rive/core/CommandQueue;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lapp/rive/PropertySubscriptionKey;", "key", "", "acquire", "(Lapp/rive/PropertySubscriptionKey;)Z", "Lp/rih1;", "release", "(Lapp/rive/PropertySubscriptionKey;)V", "closeAll", "()V", "Lapp/rive/core/CommandQueue;", "J", "", "", "collectorCounts", "Ljava/util/Map;", "closed", "Z", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class PropertySubscriptions {
    private boolean closed;
    private final Map<PropertySubscriptionKey, Integer> collectorCounts;
    private final long instanceHandle;
    private final CommandQueue riveWorker;

    private PropertySubscriptions(CommandQueue commandQueue, long j) {
        this.riveWorker = commandQueue;
        this.instanceHandle = j;
        this.collectorCounts = new LinkedHashMap();
    }

    public final synchronized boolean acquire(PropertySubscriptionKey key) {
        try {
            if (this.closed) {
                return false;
            }
            Integer num = this.collectorCounts.get(key);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 0) {
                this.riveWorker.m290subscribeToPropertyiFQtAB8(this.instanceHandle, key.getPropertyPath(), key.getPropertyType());
            }
            this.collectorCounts.put(key, Integer.valueOf(iIntValue + 1));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void closeAll() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        List<PropertySubscriptionKey> listL1 = o7h.l1(this.collectorCounts.keySet());
        this.collectorCounts.clear();
        RuntimeException runtimeException = null;
        for (PropertySubscriptionKey propertySubscriptionKey : listL1) {
            try {
                this.riveWorker.m293unsubscribeFromPropertyiFQtAB8(this.instanceHandle, propertySubscriptionKey.getPropertyPath(), propertySubscriptionKey.getPropertyType());
            } catch (RuntimeException e) {
                if (runtimeException == null) {
                    runtimeException = e;
                }
            }
        }
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final synchronized void release(PropertySubscriptionKey key) {
        try {
            if (this.closed) {
                return;
            }
            Integer num = this.collectorCounts.get(key);
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue == 1) {
                    this.riveWorker.m293unsubscribeFromPropertyiFQtAB8(this.instanceHandle, key.getPropertyPath(), key.getPropertyType());
                    this.collectorCounts.remove(key);
                } else {
                    this.collectorCounts.put(key, Integer.valueOf(iIntValue - 1));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public /* synthetic */ PropertySubscriptions(CommandQueue commandQueue, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(commandQueue, j);
    }
}
