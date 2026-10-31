package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum j970 {
    DEFAULT("default", vrd.a),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE_LINE_TITLE("doubleLineTitle", vrd.b),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE_LINE_SUBTITLE("doubleLineSubtitle", vrd.c);

    public final String a;
    public final vrd b;

    j970(String str, vrd vrdVar) {
        this.a = str;
        this.b = vrdVar;
        HubsImmutableComponentBundle.b.a.J("textLayout", str).o();
    }
}
