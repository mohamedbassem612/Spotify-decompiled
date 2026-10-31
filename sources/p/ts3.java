package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum ts3 {
    CONTENT_PICKER(yon1.G1("ALLBOARDING_CONTENTPICKER", "allboarding/contentpicker", 144, qm3.b), new lik1("spotify:internal:allboarding:origin:default")),
    SEARCH(yon1.G1("ALLBOARDING_SEARCH", "allboarding/search", 148, qm3.b), new lik1("spotify:internal:allboarding:search")),
    SUMMARY(yon1.G1("ALLBOARDING_SEND", "allboarding/send", 149, qm3.b), new lik1("spotify:internal:allboarding:send")),
    NOTIFICATION_PERMISSION(yon1.G1("PUSHOPTIN", "pushoptin", 1604, "pushoptin"), new lik1("spotify:internal:push-opt-in")),
    CAROUSEL(yon1.G1("ALLBOARDING_CAROUSEL", "allboarding/carousel", 143, qm3.b), new lik1("spotify:internal:allboarding:carousel"));

    public final p6r0 a;
    public final lik1 b;

    static {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
    }

    ts3(p6r0 p6r0Var, lik1 lik1Var) {
        this.a = p6r0Var;
        this.b = lik1Var;
    }
}
