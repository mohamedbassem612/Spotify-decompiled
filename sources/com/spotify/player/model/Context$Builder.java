package com.spotify.player.model;

import java.util.List;
import java.util.Map;
import p.b380;
import p.j380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class Context$Builder {
    public static Context$Builder builder() {
        return Context.builder("");
    }

    public abstract Context build();

    public Context$Builder metadata(Map<String, String> map) {
        return metadata(j380.c(map));
    }

    public abstract Context$Builder metadata(j380 j380Var);

    public Context$Builder pages(List<ContextPage> list) {
        return pages(b380.p(list));
    }

    public abstract Context$Builder pages(b380 b380Var);

    public abstract Context$Builder restrictions(Restrictions restrictions);

    public abstract Context$Builder uri(String str);

    public abstract Context$Builder url(String str);
}
