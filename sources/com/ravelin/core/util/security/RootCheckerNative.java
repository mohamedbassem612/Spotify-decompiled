package com.ravelin.core.util.security;

import kotlin.Metadata;
import p.ike1;
import p.utw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000J\"\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ravelin/core/util/security/RootCheckerNative;", "", "", "pathArray", "", "checkForRoot", "([Ljava/lang/Object;)Z", "logDebugMessages", "Lp/rih1;", "setLogDebugMessages", "(Z)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RootCheckerNative {
    public static final String b;
    public final boolean a;

    static {
        String canonicalName = RootCheckerNative.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "RootCheckerNative";
        }
        b = canonicalName;
    }

    public RootCheckerNative() {
        System.loadLibrary("rootChecker");
        try {
            System.loadLibrary("rootChecker");
            this.a = true;
        } catch (UnsatisfiedLinkError e) {
            String message = e.getMessage();
            utw0 utw0Var = ike1.a;
            utw0Var.y(b);
            utw0Var.o(message, new Object[0]);
        }
    }

    private final native boolean checkForRoot(Object[] pathArray);

    private final native void setLogDebugMessages(boolean logDebugMessages);

    public final void a() {
        setLogDebugMessages(false);
    }

    public final boolean b(Object[] objArr) {
        return checkForRoot(objArr);
    }
}
