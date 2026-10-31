package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jqs extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hur b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jqs(hur hurVar, byte b) {
        super(2);
        this.a = b;
        this.b = hurVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        hur hurVar = this.b;
        switch (b) {
            case 0:
                iu30 iu30Var = (iu30) obj2;
                Activity activity = (Activity) hurVar.b;
                mw40 mw40VarA = ((nw40) obj).a(activity.getString(2131962563));
                String string = activity.getString(2131962565);
                iqs iqsVar = new iqs(hurVar, iu30Var, (byte) 0);
                mw40VarA.a = string;
                mw40VarA.c = iqsVar;
                String string2 = activity.getString(2131962564);
                iqs iqsVar2 = new iqs(iu30Var, hurVar, (byte) 1);
                mw40VarA.b = string2;
                mw40VarA.d = iqsVar2;
                return mw40VarA;
            case 1:
                iu30 iu30Var2 = (iu30) obj2;
                Activity activity2 = (Activity) hurVar.b;
                mw40 mw40VarA2 = ((nw40) obj).a(activity2.getString(2131962566));
                String string3 = activity2.getString(2131962564);
                iqs iqsVar3 = new iqs(iu30Var2, hurVar, (byte) 2);
                mw40VarA2.a = string3;
                mw40VarA2.c = iqsVar3;
                String string4 = activity2.getString(2131962565);
                iqs iqsVar4 = new iqs(hurVar, iu30Var2, (byte) 3);
                mw40VarA2.b = string4;
                mw40VarA2.d = iqsVar4;
                return mw40VarA2;
            default:
                iu30 iu30Var3 = (iu30) obj2;
                Activity activity3 = (Activity) hurVar.b;
                mw40 mw40VarA3 = ((nw40) obj).a(activity3.getString(2131962567));
                String string5 = activity3.getString(2131962565);
                iqs iqsVar5 = new iqs(hurVar, iu30Var3, (byte) 4);
                mw40VarA3.a = string5;
                mw40VarA3.c = iqsVar5;
                String string6 = activity3.getString(2131962564);
                iqs iqsVar6 = new iqs(iu30Var3, hurVar, (byte) 5);
                mw40VarA3.b = string6;
                mw40VarA3.d = iqsVar6;
                return mw40VarA3;
        }
    }
}
