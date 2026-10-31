package p;

import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i5g implements bh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChoiceScreenUcActivity b;

    public /* synthetic */ i5g(ChoiceScreenUcActivity choiceScreenUcActivity, byte b) {
        this.a = b;
        this.b = choiceScreenUcActivity;
    }

    public final void a(Object obj) {
        byte b = this.a;
        ChoiceScreenUcActivity choiceScreenUcActivity = this.b;
        switch (b) {
            case 0:
                f5g f5gVar = ChoiceScreenUcActivity.y1;
                choiceScreenUcActivity.m0().U(new f7g((g250) obj));
                break;
            case 1:
                f5g f5gVar2 = ChoiceScreenUcActivity.y1;
                choiceScreenUcActivity.m0().U(new n7g((h3b1) obj));
                break;
            default:
                tan tanVar = (tan) obj;
                if (tanVar != null) {
                    f5g f5gVar3 = ChoiceScreenUcActivity.y1;
                    choiceScreenUcActivity.m0().U(new a7g(tanVar));
                }
                break;
        }
    }
}
