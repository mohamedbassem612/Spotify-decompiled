package p;

import java.text.BreakIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rd50 extends ton1 {
    public final BreakIterator c;

    public rd50(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.c = characterInstance;
    }

    @Override // p.ton1
    public final int x(int i) {
        return this.c.following(i);
    }

    @Override // p.ton1
    public final int z(int i) {
        return this.c.preceding(i);
    }
}
