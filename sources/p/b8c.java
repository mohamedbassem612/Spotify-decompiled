package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.browse.clientnative.integration.services.structureapi.DismissedEntity;
import com.spotify.browse.clientnative.mobius.BrowseEffect;
import com.spotify.browse.clientnative.mobius.BrowseEvent;
import com.spotify.browse.clientnative.mobius.BrowseState;
import com.spotify.browse.clientnative.mobius.Model;
import com.spotify.browse.clientnative.mobius.c;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class b8c implements Update {
    /* JADX WARN: Code duplicated, block: B:94:0x022e  */
    public final Next a(Object obj, Object obj2) {
        Next nextJ;
        int iIntValue;
        w7x w7xVarSingleton;
        Model model;
        BrowseState browseState = (BrowseState) obj;
        BrowseEvent browseEvent = (BrowseEvent) obj2;
        boolean z = browseEvent instanceof BrowseEvent.StructureLoaded;
        jce0 jce0Var = jce0.b;
        if (z) {
            BrowseEvent.StructureLoaded structureLoaded = (BrowseEvent.StructureLoaded) browseEvent;
            eww0 profile = structureLoaded.getProfile();
            Model browsitaContent = structureLoaded.getBrowsitaContent();
            BrowseState.Content contentA = c.a(browseState);
            String dataSource = (contentA == null || (model = contentA.getModel()) == null) ? null : model.getDataSource();
            String dataSource2 = structureLoaded.getBrowsitaContent().getDataSource();
            if (ihc1.y0(dataSource2)) {
                dataSource2 = null;
            }
            Model modelCopy$default = Model.copy$default(browsitaContent, null, null, null, null, o7h.y0(f46.i0(new String[]{dataSource, dataSource2}), (CharSequence) null, (String) null, (String) null, (iu30) null, 63), structureLoaded.getShouldShowDSABanner(), 15, null);
            BrowseState.Content contentA2 = c.a(browseState);
            if (contentA2 != null) {
                iIntValue = contentA2.getColumnCount();
            } else {
                BrowseState.UIRendered uIRendered = browseState instanceof BrowseState.UIRendered ? (BrowseState.UIRendered) browseState : null;
                Integer numValueOf = uIRendered != null ? Integer.valueOf(uIRendered.getColumnCount()) : null;
                if (numValueOf == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                iIntValue = numValueOf.intValue();
            }
            BrowseState.Content content = new BrowseState.Content(profile, modelCopy$default, iIntValue);
            int iOrdinal = structureLoaded.getLoadingStrategy().ordinal();
            if (iOrdinal == 0) {
                w7xVarSingleton = Collections.singleton(new BrowseEffect.Load(jce0Var));
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                w7xVarSingleton = w7x.a;
            }
            nextJ = Next.i(content, w7xVarSingleton);
        } else if (browseEvent instanceof BrowseEvent.StructureLoadFailed) {
            BrowseEvent.StructureLoadFailed structureLoadFailed = (BrowseEvent.StructureLoadFailed) browseEvent;
            int iOrdinal2 = structureLoadFailed.getLoadingStrategy().ordinal();
            if (iOrdinal2 == 0) {
                nextJ = Next.a(Collections.singleton(new BrowseEffect.Load(jce0Var)));
            } else {
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                nextJ = !(browseState instanceof BrowseState.Content) ? Next.h(new BrowseState.Error(structureLoadFailed.getThrowable())) : Next.j();
            }
        } else if (browseEvent instanceof BrowseEvent.ExplicitFeedbackListChanged) {
            BrowseEvent.ExplicitFeedbackListChanged explicitFeedbackListChanged = (BrowseEvent.ExplicitFeedbackListChanged) browseEvent;
            BrowseState.Content content2 = browseState instanceof BrowseState.Content ? (BrowseState.Content) browseState : null;
            if (content2 == null) {
                nextJ = Next.j();
            } else {
                Model model2 = content2.getModel();
                Set<DismissedEntity> dismissedSectionUris = content2.getModel().getDismissedSectionUris();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : dismissedSectionUris) {
                    if (((DismissedEntity) obj3).getType() != DismissedEntity.Type.EXPLICIT_FEEDBACK) {
                        arrayList.add(obj3);
                    }
                }
                Set setP1 = o7h.p1(arrayList);
                Map mapB = c.b(model2.getSections());
                Set<String> entityUris = explicitFeedbackListChanged.getEntityUris();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = entityUris.iterator();
                while (it.hasNext()) {
                    s7c s7cVar = (s7c) mapB.get((String) it.next());
                    DismissedEntity dismissedEntity = s7cVar == null ? null : new DismissedEntity(s7cVar.getId(), DismissedEntity.Type.EXPLICIT_FEEDBACK);
                    if (dismissedEntity != null) {
                        arrayList2.add(dismissedEntity);
                    }
                }
                nextJ = Next.h(BrowseState.Content.copy$default(content2, null, Model.copy$default(model2, null, null, null, dm61.y0(setP1, arrayList2), null, false, 55, null), 0, 5, null));
            }
        } else {
            boolean z2 = browseEvent instanceof o7c;
            jce0 jce0Var2 = jce0.a;
            if (z2) {
                nextJ = Next.a(Collections.singleton(new BrowseEffect.Load(jce0Var2)));
            } else if (browseEvent instanceof p7c) {
                nextJ = Next.i(new BrowseState.UIRendered(((p7c) browseEvent).a), Collections.singleton(new BrowseEffect.Load(jce0Var2)));
            } else if (browseEvent instanceof r7c) {
                r7c r7cVar = (r7c) browseEvent;
                BrowseState.Content content3 = browseState instanceof BrowseState.Content ? (BrowseState.Content) browseState : null;
                if (content3 == null) {
                    nextJ = Next.j();
                } else {
                    Model model3 = content3.getModel();
                    nextJ = Next.h(BrowseState.Content.copy$default(content3, null, Model.copy$default(model3, null, null, null, dm61.x0(new DismissedEntity(r7cVar.a, DismissedEntity.Type.SHOWCASE), model3.getDismissedSectionUris()), null, false, 55, null), 0, 5, null));
                }
            } else if (browseEvent instanceof n7c) {
                n7c n7cVar = (n7c) browseEvent;
                if (browseState instanceof BrowseState.Content) {
                    BrowseState.Content content4 = (BrowseState.Content) browseState;
                    int columnCount = content4.getColumnCount();
                    int i = n7cVar.a;
                    if (columnCount != i) {
                        nextJ = Next.h(BrowseState.Content.copy$default(content4, null, null, i, 3, null));
                    } else {
                        nextJ = Next.j();
                    }
                } else {
                    nextJ = Next.j();
                }
            } else {
                if (!(browseEvent instanceof q7c)) {
                    eg.o();
                    return null;
                }
                q7c q7cVar = (q7c) browseEvent;
                BrowseState.Content contentA3 = c.a(browseState);
                nextJ = (contentA3 == null || contentA3.getModel().getShouldShowDSABanner() == q7cVar.a) ? Next.j() : Next.i(BrowseState.Content.copy$default(contentA3, null, Model.copy$default(contentA3.getModel(), null, null, null, null, null, q7cVar.a, 31, null), 0, 5, null), Collections.singleton(new BrowseEffect.Load(jce0Var2)));
            }
        }
        String strBreadcrumb = browseEvent.breadcrumb();
        String strBreadcrumb2 = browseState.breadcrumb();
        String strBreadcrumb3 = nextJ.d() ? ((BrowseState) nextJ.g()).breadcrumb() : "empty";
        StringBuilder sbN = gvg.n("BrowsePage :: event: ", strBreadcrumb, ", oldModel: ", strBreadcrumb2, ", newModel: ");
        sbN.append(strBreadcrumb3);
        Logger.b(sbN.toString(), new Object[0]);
        return nextJ;
    }
}
