package com.spotify.voiceassistants.playermodels;

import com.spotify.player.model.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import p.bga0;
import p.dar;
import p.ega0;
import p.fga0;
import p.h661;
import p.jga0;
import p.nma0;
import p.omo1;
import p.sqg0;
import p.uax;
import p.uga0;
import p.vga0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/ContextSerializer;", "Lp/nma0;", "Lcom/spotify/player/model/Context;", "<init>", "()V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/player/model/Context;", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/player/model/Context;)V", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContextSerializer implements nma0 {
    public static final ContextSerializer INSTANCE = new ContextSerializer();
    private static final h661 descriptor = omo1.j("com.spotify.player.model.Context", new h661[0]);

    private ContextSerializer() {
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public Context m8deserialize(dar decoder) {
        String strG;
        String strG2;
        uga0 uga0VarL = fga0.l(((bga0) decoder).m());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ega0 ega0Var = (ega0) uga0VarL.get("uri");
        String str = "";
        if (ega0Var == null || (strG = fga0.g(fga0.m(ega0Var))) == null) {
            strG = "";
        }
        ega0 ega0Var2 = (ega0) uga0VarL.get("url");
        if (ega0Var2 != null && (strG2 = fga0.g(fga0.m(ega0Var2))) != null) {
            str = strG2;
        }
        ega0 ega0Var3 = (ega0) uga0VarL.get("metadata");
        if (ega0Var3 != null) {
            for (Map.Entry entry : fga0.l(ega0Var3).a.entrySet()) {
                String str2 = (String) entry.getKey();
                String strG3 = fga0.g(fga0.m((ega0) entry.getValue()));
                if (strG3 != null) {
                    linkedHashMap.put(str2, strG3);
                }
            }
        }
        return Context.builder(strG).url(str).metadata(sqg0.U(linkedHashMap)).build();
    }

    public h661 getDescriptor() {
        return descriptor;
    }

    public void serialize(uax encoder, Context value) {
        jga0 jga0Var = (jga0) encoder;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!value.metadata().isEmpty()) {
            ContextSerializer$serialize$1$1 contextSerializer$serialize$1$1 = new ContextSerializer$serialize$1$1(value);
            vga0 vga0Var = new vga0();
            contextSerializer$serialize$1$1.invoke(vga0Var);
        }
        jga0Var.R(new uga0(linkedHashMap));
    }
}
