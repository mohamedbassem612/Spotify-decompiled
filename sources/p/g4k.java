package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g4k {
    public final a3k a;
    public final llm b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public g4k(q8n q8nVar, a3k a3kVar) {
        this.a = a3kVar;
        this.b = smo1.e(flo1.l(new z8n("WrappedCompositionHandler"), q8nVar));
    }

    public final c4k a(StoryCard storyCard) {
        return (c4k) this.d.computeIfAbsent(storyCard.getId(), new d4k(storyCard, (byte) 0));
    }
}
