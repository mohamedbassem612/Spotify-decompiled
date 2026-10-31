package com.spotify.campfire.service.impl;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/campfire/service/impl/ChatsUpdatingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "src_main_java_com_spotify_campfire_service_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class ChatsUpdatingException extends Exception {
    public ChatsUpdatingException() {
        super("Chats are already updating");
    }
}
