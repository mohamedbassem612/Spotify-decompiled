package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wga0 implements h661 {
    public static final wga0 b = new wga0();
    public static final String c = "kotlinx.serialization.json.JsonObject";
    public final /* synthetic */ mlc0 a;

    public wga0() {
        chc1 chc1Var = chc1.a;
        this.a = new mlc0("kotlin.collections.LinkedHashMap", chc1.b, hga0.a.getDescriptor());
    }

    public final boolean b() {
        return false;
    }

    public final int c(String str) {
        return this.a.c(str);
    }

    public final int d() {
        return this.a.d;
    }

    public final String e(int i) {
        return String.valueOf(i);
    }

    public final List f(int i) {
        this.a.f(i);
        return z6x.a;
    }

    public final h661 g(int i) {
        return this.a.g(i);
    }

    public final List getAnnotations() {
        return z6x.a;
    }

    public final yoi1 getKind() {
        return vic1.h;
    }

    public final String h() {
        return c;
    }

    public final boolean i(int i) {
        this.a.i(i);
        return false;
    }

    public final boolean isInline() {
        return false;
    }
}
