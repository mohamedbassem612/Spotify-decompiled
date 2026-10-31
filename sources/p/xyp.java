package p;

import com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity;
import com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity;
import com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity;
import com.spotify.apprater.appraterdialog.AppRaterActivity;
import com.spotify.blend.tastematch.BlendStoryContainerActivity;
import com.spotify.blend.tastematch.BlendTasteMatchActivity;
import com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity;
import com.spotify.endless.sessionstarter.EndlessActivity;
import com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity;
import com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity;
import com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider;
import com.spotify.storage.localstorage.DiskAlmostFullActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xyp implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ xyp(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new toj0(daqVar, (AccountPickerActivity) obj);
            case 1:
                return new yxo(daqVar, (AccountSelectionActivity) obj);
            case 2:
                return new p2o0(daqVar, (AccountSwitcherActivity) obj);
            case 3:
                return new qqp(daqVar, (AgeAssuranceWebViewActivity) obj);
            case 4:
                return new ip31(daqVar, (AgeVerificationDialogActivity) obj);
            case 5:
                return new f9p(daqVar, (AllboardingActivity) obj);
            case 6:
                return new e0q(daqVar);
            case 7:
                cp31 cp31Var = new cp31();
                cp31Var.b = daqVar;
                cp31Var.a = (AppProtocolRemoteService) obj;
                cp31Var.c = xqu.b(new p2p(daqVar, cp31Var, 1, (byte) 13));
                cp31Var.d = iy81.a(new p2p(daqVar, cp31Var, 0, (byte) 13));
                cp31Var.e = new p2p(daqVar, cp31Var, 2, (byte) 13);
                cp31Var.f = new p2p(daqVar, cp31Var, 3, (byte) 13);
                return cp31Var;
            case 8:
                return new g1i(daqVar, (AppRaterActivity) obj);
            case 9:
                return new i0q(daqVar, (AuthorizationActivity) obj);
            case 10:
                return new k9k(daqVar, (AuthorizationCommandProxyActivity) obj);
            case 11:
                return new i7d(daqVar, (BlendStoryContainerActivity) obj);
            case 12:
                return new o0q(daqVar, (BlendTasteMatchActivity) obj);
            case 13:
                return new p0q(daqVar, (byte) 0);
            case 14:
                return new jzp(daqVar, (byte) 1);
            case 15:
                return new g1i(daqVar, (CallingCodePickerActivity) obj);
            case 16:
                return new qqp(daqVar, (ChoiceScreenUcActivity) obj);
            case 17:
                return new f9p(daqVar, (CoverScreenWidgetProvider) obj);
            case 18:
                return new ks6(daqVar, (CulturalMomentsStoryActivity) obj);
            case 19:
                return new k2q(daqVar, (byte) 0);
            case 20:
                return new g1i(daqVar, (DiskAlmostFullActivity) obj);
            case 21:
                return new q0q(daqVar, (byte) 1);
            case 22:
                return new wdm(daqVar);
            case 23:
                return new y0q(daqVar, (byte) 1);
            case 24:
                return new e93(daqVar, (EndlessActivity) obj);
            case 25:
                return new b1q(daqVar, (byte) 1);
            case 26:
                return new izp(daqVar, (byte) 1);
            case 27:
                return new e93(daqVar, (FandomCollectiblesStoryActivity) obj);
            case 28:
                return new ip31(daqVar, (ForcedGraduationLockActivity) obj);
            default:
                return new d1q(daqVar);
        }
    }
}
