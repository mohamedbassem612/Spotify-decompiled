package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class woz0 extends a8d1 implements bv30 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ g2z e;
    public final /* synthetic */ Map f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woz0(g2z g2zVar, Map map, lnm lnmVar) {
        super(5, lnmVar);
        this.e = g2zVar;
        this.f = map;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        woz0 woz0Var = new woz0(this.e, this.f, (lnm) obj5);
        woz0Var.a = zBooleanValue;
        woz0Var.b = zBooleanValue2;
        woz0Var.c = zBooleanValue3;
        woz0Var.d = zBooleanValue4;
        return woz0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        hm5.M(obj);
        boolean z5 = false;
        if ((!z || z2) && z3) {
            eu4 eu4Var = (eu4) this.e.f;
            boolean z6 = eu4Var.m() || eu4Var.a();
            Map map = this.f;
            CharSequence charSequence3 = (CharSequence) map.get("save_track.uri");
            boolean z7 = ((charSequence3 == null || charSequence3.length() == 0) && ((charSequence = (CharSequence) map.get("audio_association")) == null || charSequence.length() == 0) && ((charSequence2 = (CharSequence) map.get("is_music_video")) == null || charSequence2.length() == 0)) ? false : true;
            if ((!z6 || !z7) && !z4) {
                z5 = true;
            }
        }
        return Boolean.valueOf(z5);
    }
}
