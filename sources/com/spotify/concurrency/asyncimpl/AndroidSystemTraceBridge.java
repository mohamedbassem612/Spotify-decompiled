package com.spotify.concurrency.asyncimpl;

import kotlin.Metadata;
import p.mif1;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/concurrency/asyncimpl/AndroidSystemTraceBridge;", "", "<init>", "()V", "", "name", "", "cookie", "Lp/rih1;", "beginAsyncSection", "(Ljava/lang/String;I)V", "endAsyncSection", "", "value", "setCounter", "(Ljava/lang/String;J)V", "src_main_java_com_spotify_concurrency_asyncimpl-asyncimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AndroidSystemTraceBridge {
    public static final AndroidSystemTraceBridge INSTANCE = new AndroidSystemTraceBridge();

    private AndroidSystemTraceBridge() {
    }

    public static final void beginAsyncSection(String name, int cookie) {
        if (mif1.g()) {
            mif1.d(name, cookie);
        }
    }

    public static final void endAsyncSection(String name, int cookie) {
        mif1.e(name, cookie);
    }

    public static final void setCounter(String name, long value) {
        if (mif1.g()) {
            mif1.h((int) yoi1.r(value, -2147483648L, 2147483647L), name);
        }
    }
}
