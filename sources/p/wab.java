package p;

import com.spotify.pses.v1.proto.Authentication;
import com.spotify.pses.v1.proto.Header;
import com.spotify.pses.v1.proto.ValueProposition;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wab {
    public final String a;
    public final Authentication b;
    public final Header c;
    public final ValueProposition d;

    public wab(Authentication authentication, Header header, ValueProposition valueProposition, String str) {
        this.a = str;
        this.b = authentication;
        this.c = header;
        this.d = valueProposition;
    }
}
