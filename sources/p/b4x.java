package p;

import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b4x implements o5s {
    public final /* synthetic */ x8c0 a;

    public b4x(EmojiCompatInitializer emojiCompatInitializer, x8c0 x8c0Var) {
        this.a = x8c0Var;
    }

    @Override // p.o5s
    public final void onResume(iac0 iac0Var) {
        j2h1.B().postDelayed(new ghp0((byte) 1), 500L);
        this.a.d(this);
    }
}
