package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x641 implements suk {
    public final /* synthetic */ byte a;

    @Override // p.suk
    public final boolean b(String str) {
        switch (this.a) {
            case 0:
                return "com.samsung.android.app.smartcapture".equals(str);
            case 1:
                return "com.samsung.android.app.moments".equals(str);
            default:
                return "com.samsung.android.app.routines".equals(str);
        }
    }

    @Override // p.suk
    public final String f() {
        switch (this.a) {
        }
        return "spotify_media_browser_root_samsung";
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        switch (this.a) {
            case 0:
                return m210.a("samsung ai select", super.h(str, str2, tn31Var));
            case 1:
                return m210.a("samsung moments", super.h(str, str2, tn31Var));
            default:
                return m210.a("samsung routines", super.h(str, str2, tn31Var));
        }
    }

    @Override // p.suk
    public final hf61 j() {
        byte b = this.a;
        return hf61.i;
    }
}
