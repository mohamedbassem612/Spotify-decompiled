package androidx.car.app.dialer;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p.bi80;
import p.mxd1;
import p.nxd1;
import p.qrd;
import p.sxd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class TelephoneKeypadTemplate implements sxd1 {
    public static final int KEY_EIGHT = 8;
    public static final int KEY_FIVE = 5;
    public static final int KEY_FOUR = 4;
    public static final int KEY_NINE = 9;
    public static final int KEY_ONE = 1;
    public static final int KEY_POUND = 11;
    public static final int KEY_SEVEN = 7;
    public static final int KEY_SIX = 6;
    public static final int KEY_STAR = 10;
    public static final int KEY_THREE = 3;
    public static final int KEY_TWO = 2;
    public static final int KEY_ZERO = 0;
    private final Header mHeader;
    private final Map<Integer, CarText> mKeySecondaryTexts;
    private final String mPhoneNumber;
    private final bi80 mPhoneNumberChangedDelegate;
    private final Action mPrimaryAction;
    private final mxd1 mTelephoneKeypadCallbackDelegate;

    public TelephoneKeypadTemplate() {
        this.mHeader = null;
        this.mPhoneNumber = null;
        this.mPrimaryAction = null;
        this.mTelephoneKeypadCallbackDelegate = null;
        this.mPhoneNumberChangedDelegate = null;
        this.mKeySecondaryTexts = new HashMap(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelephoneKeypadTemplate)) {
            return false;
        }
        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
        if (Objects.equals(this.mHeader, telephoneKeypadTemplate.mHeader) && Objects.equals(this.mPhoneNumber, telephoneKeypadTemplate.mPhoneNumber) && Objects.equals(this.mPrimaryAction, telephoneKeypadTemplate.mPrimaryAction)) {
            if ((this.mTelephoneKeypadCallbackDelegate == null) == (telephoneKeypadTemplate.mTelephoneKeypadCallbackDelegate == null)) {
                if ((this.mPhoneNumberChangedDelegate == null) == (telephoneKeypadTemplate.mPhoneNumberChangedDelegate == null) && this.mKeySecondaryTexts.size() == telephoneKeypadTemplate.mKeySecondaryTexts.size() && this.mKeySecondaryTexts.entrySet().containsAll(telephoneKeypadTemplate.mKeySecondaryTexts.entrySet())) {
                    return true;
                }
            }
        }
        return false;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public Map<Integer, CarText> getKeySecondaryTexts() {
        return this.mKeySecondaryTexts;
    }

    public String getPhoneNumber() {
        return this.mPhoneNumber;
    }

    public bi80 getPhoneNumberChangedDelegate() {
        return this.mPhoneNumberChangedDelegate;
    }

    public Action getPrimaryAction() {
        return this.mPrimaryAction;
    }

    public mxd1 getTelephoneKeypadCallbackDelegate() {
        return this.mTelephoneKeypadCallbackDelegate;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mPhoneNumber, this.mPrimaryAction, Boolean.valueOf(this.mTelephoneKeypadCallbackDelegate == null), Boolean.valueOf(this.mPhoneNumberChangedDelegate == null), this.mKeySecondaryTexts);
    }

    public String toString() {
        return "TelephoneKeypadTemplate { header: " + this.mHeader + "; phone number: " + this.mPhoneNumber + "; primaryAction: " + this.mPrimaryAction + "; secondaryTextMap: " + this.mKeySecondaryTexts + " }";
    }

    private TelephoneKeypadTemplate(nxd1 nxd1Var) {
        throw null;
    }
}
