package com.spotify.storage.localstorage;

import android.os.Bundle;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.h0i;
import p.j2i;
import p.kx40;
import p.mir0;
import p.ndu;
import p.nik1;
import p.p6r0;
import p.t3b1;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/storage/localstorage/DiskAlmostFullActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_storage_localstorage-localstorage"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class DiskAlmostFullActivity extends t3b1 {
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("DIALOG_DISKALMOSTFULL", "dialog/diskalmostfull", 480, "dialog"), nik1.J1.a(), 4));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h0i.a(this, new j2i(1558999806, new ndu(this, (byte) 2), true));
    }
}
