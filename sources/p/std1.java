package p;

import com.spotify.spotifyuserprofile.v0.Note;
import com.spotify.spotifyuserprofile.v0.Section;
import com.spotify.spotifyuserprofile.v0.SectionContent;
import com.spotify.spotifyuserprofile.v0.TasteProfilePage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class std1 {
    public final hud1 a;
    public final ve01 b;

    public std1(hud1 hud1Var, m7o0 m7o0Var) {
        this.a = hud1Var;
        this.b = m7o0Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(onm onmVar) {
        rtd1 rtd1Var;
        if (onmVar instanceof rtd1) {
            rtd1Var = (rtd1) onmVar;
            int i = rtd1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rtd1Var.c = i - Integer.MIN_VALUE;
            } else {
                rtd1Var = new rtd1(this, onmVar);
            }
        } else {
            rtd1Var = new rtd1(this, onmVar);
        }
        Object objA = rtd1Var.a;
        int i2 = rtd1Var.c;
        String str = null;
        if (i2 == 0) {
            hm5.M(objA);
            rtd1Var.c = 1;
            objA = this.a.a(rtd1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        TasteProfilePage tasteProfilePage = (TasteProfilePage) objA;
        String strP = tasteProfilePage.p();
        String str2 = strP.length() == 0 ? null : strP;
        h290<Section> h290VarQ = tasteProfilePage.q();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
        for (Section section : h290VarQ) {
            section.getClass();
            String strQ = section.q();
            String title = section.r() ? section.getTitle() : str;
            String description = section.getDescription();
            String str3 = description.length() == 0 ? str : description;
            List<SectionContent> contentList = section.getContentList();
            ArrayList arrayList2 = new ArrayList();
            for (SectionContent sectionContent : contentList) {
                sectionContent.getClass();
                evd1 evd1Var = sectionContent.o() ? new evd1(sectionContent.n().getTitle(), sectionContent.n().getDescription(), sectionContent.n().o()) : null;
                if (evd1Var != null) {
                    arrayList2.add(evd1Var);
                }
            }
            h290<Note> h290VarO = section.o();
            ArrayList arrayList3 = new ArrayList(q7h.U(h290VarO, 10));
            for (Note note : h290VarO) {
                note.getClass();
                String strQ2 = note.q();
                String strO = note.o();
                long jS = note.s() / 1000;
                boolean z = false;
                if (note.r() == ksw0.PROCESSING) {
                    z = true;
                }
                arrayList3.add(new ct10(strQ2, strO, jS, z, note.n() == gd.ACCEPTED));
            }
            arrayList.add(new dvd1(strQ, title, str3, arrayList2, arrayList3, section.n(), section.p()));
            str = null;
        }
        String strN = tasteProfilePage.n();
        String str4 = strN.length() == 0 ? null : strN;
        String strO2 = tasteProfilePage.o();
        return new sud1(tasteProfilePage.r(), str2, str4, strO2.length() == 0 ? null : strO2, arrayList);
    }
}
