package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uk0 {
    public static final ArrayList c = v1p1.c(new mmr0("AUTOMOTIVE", 2131951821), new mmr0("BEAUTY_AND_GROOMING", 2131951822), new mmr0("BUSINESS_AND_FINANCE", 2131951823), new mmr0("CAREERS", 2131951824), new mmr0("CLOTHING_AND_FASHION", 2131951825), new mmr0("EDUCATION_AND_TRAINING", 2131951827), new mmr0("EVENTS", 2131951828), new mmr0("FAMILY_AND_PARENTING", 2131951829), new mmr0("FITNESS_AND_RECREATION", 2131951830), new mmr0("FOOD_AND_DRINK", 2131951831), new mmr0("GAMING", 2131951833), new mmr0("HOME_AND_GARDEN", 2131951834), new mmr0("MEDIA_AND_ENTERTAINMENT", 2131951835), new mmr0("MUSIC", 2131951836), new mmr0("PODCASTS", 2131951837), new mmr0("SPORTS", 2131951840), new mmr0("TECHNOLOGY", 2131951841), new mmr0("TRAVEL", 2131951842));
    public static final ArrayList d = v1p1.c(new mmr0("ALCOHOL", 2131951820), new mmr0("DATING", 2131951826), new mmr0("GAMBLING", 2131951832), new mmr0("POLITICAL_AND_SOCIAL_ISSUES", 2131951838), new mmr0("PREGNANCY_AND_PARENTING", 2131951839), new mmr0("WEIGHT_LOSS", 2131951843));
    public final String a;
    public final int b;

    public uk0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk0)) {
            return false;
        }
        uk0 uk0Var = (uk0) obj;
        return u890.j(this.a, uk0Var.a) && this.b == uk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
