package p;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rco0 implements kj41 {
    public final UUID a;

    public rco0(UUID uuid) {
        this.a = uuid;
    }

    @Override // p.kj41
    public final long b() {
        return 0L;
    }

    @Override // p.kj41
    public final Map getAttributes() {
        return b7x.a;
    }

    @Override // p.kj41
    public final UUID getId() {
        return this.a;
    }

    @Override // p.kj41
    public final String getKey() {
        return "";
    }

    @Override // p.kj41
    public final void cancel() {
    }

    @Override // p.kj41
    public final void stop() {
    }

    @Override // p.kj41
    public final void a(long j) {
    }

    @Override // p.kj41
    public final kj41 c(Map map) {
        return this;
    }

    @Override // p.kj41
    public final kj41 d(long j) {
        return this;
    }

    @Override // p.kj41
    public final kj41 setAttribute(String str, String str2) {
        return this;
    }
}
