package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Collections;
import p.b380;
import p.j380;
import p.spq0;
import p.w280;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonDeserialize
public abstract class Context {
    public static Builder builder(String str) {
        return new AutoValue_Context.Builder().uri(str).url("").metadata(Collections.EMPTY_MAP);
    }

    public static Context fromTrackUris(String str, b380 b380Var) {
        ArrayList arrayList = new ArrayList();
        w280 w280VarR = b380Var.r(0);
        while (w280VarR.hasNext()) {
            arrayList.add(ContextTrack.create((String) w280VarR.next()));
        }
        return builder(str).pages(b380.t(ContextPage.builder().tracks(arrayList).build())).build();
    }

    public static Context fromUri(String str) {
        return builder(str).url("context://" + str).build();
    }

    public abstract j380 metadata();

    public abstract spq0 pages();

    public abstract spq0 restrictions();

    public abstract Builder toBuilder();

    public abstract String uri();

    public abstract String url();
}
