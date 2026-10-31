package com.spotify.esperanto.esperantocosmos;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmos.Response;
import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.jah;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/spotify/cosmos/cosmos/Response;", "invoke"}, k = 3, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class CosmosTransport$call$mapFunc$1 extends hab0 implements iu30 {
    final /* synthetic */ String $uri;
    final /* synthetic */ CosmosTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CosmosTransport$call$mapFunc$1(CosmosTransport cosmosTransport, String str) {
        super(1);
        this.this$0 = cosmosTransport;
        this.$uri = str;
    }

    public final byte[] invoke(Response response) {
        if (response.getStatus() == 200) {
            byte[] body = response.getBody();
            return body == null ? new byte[0] : body;
        }
        byte[] body2 = response.getBody();
        jah.g(l1d.n(body2 != null ? new String(body2, this.this$0.CHARSET_UTF8) : new String(), "'", l1d.s(response.getStatus(), "Response for [", this.$uri, "] returned with status code ", ": '")));
        return null;
    }
}
